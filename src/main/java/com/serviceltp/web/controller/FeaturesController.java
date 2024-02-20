package com.serviceltp.web.controller;

import com.serviceltp.web.*;
import com.serviceltp.web.baseComponents.baseResponse.TransRefined;
import com.serviceltp.web.baseComponents.baseResponse.TransResponse;
import com.serviceltp.web.models.*;
import com.serviceltp.web.services.*;
import com.serviceltp.web.base.*;

import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.model.x509.CertificateToken;
import eu.europa.esig.dss.pades.PAdESSignatureParameters;
import eu.europa.esig.dss.pades.signature.PAdESService;
import eu.europa.esig.dss.pades.validation.PDFDocumentValidator;
import eu.europa.esig.dss.policy.jaxb.Algo;
import eu.europa.esig.dss.service.SecureRandomNonceSource;
import eu.europa.esig.dss.service.crl.OnlineCRLSource;
import eu.europa.esig.dss.service.ocsp.OnlineOCSPSource;
import eu.europa.esig.dss.service.tsp.OnlineTSPSource;
import eu.europa.esig.dss.spi.x509.aia.DefaultAIASource;
import eu.europa.esig.dss.validation.AdvancedSignature;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import eu.europa.esig.dss.validation.timestamp.TimestampToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
//@Controller
public class FeaturesController{
    private JwtService jwtService;
    @Autowired
    private UserService userService;
    private UserDetailsService userDetailsService;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private AlgorithmService algorithmService;
    @Autowired
    private CertificateService certificateService;
    @Autowired
    private TransService transService;


    //show upload form
//    @GetMapping("/features")
//    public String features()
//    {
//        return "features";
//    }

    @RequestMapping(value = "/YourTransactions", method = RequestMethod.POST)
    @ResponseBody
    public TransResponse getTransForUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User currentUser= userService.findUserByUsername(userDetails.getUsername()).orElseThrow();
        List<Trans> transes = transService.getAll();
        List<TransRefined> transesRefined = new ArrayList<>();
        for (Trans tr:transes) {
            String id = String.valueOf(tr.getId());
            Date creation_date = tr.getCreation_date();
            String hash = tr.getHash();
            String documentId = String.valueOf(tr.getDocument().getId());
            transesRefined.add(new TransRefined(id,hash,documentId,creation_date));
        }
        return new TransResponse(transesRefined);
    }

    @RequestMapping(value = "/RetrieveInfo", method = RequestMethod.POST)
    @ResponseBody
    public PresRetrieveInfoResponseType retrieveInfo(@RequestBody(required = false) PresRetrieveInfoType req) throws URISyntaxException, ParseException {

        List<PresProfileType> pros = new ArrayList<PresProfileType>();
        ProfileGeneratorImpl implGen=new ProfileGeneratorImpl();
        if(req.getPro()=="http://link.catre.identifier1" && req.getPro() == "http://link.catre.identifier2")
        {
            if(req.getPro().equals("http://link.catre.identifier1"))
            {
                pros.add(implGen.getProfile("active"));
            }
            if(req.getPro().equals("http://link.catre.identifier2"))
            {
                pros.add(implGen.getProfile("inactive"));
            }
        }
        else
        {
            if(req.getStat().equals("active"))
            {
                pros.add(implGen.getProfile("active"));
            }
            if(req.getStat().equals("inactive"))
            {
                pros.add(implGen.getProfile("inactive"));
            }
            if(req.getStat().equals("all"))
            {
                pros.add(implGen.getProfile("active"));
                pros.add(implGen.getProfile("inactive"));
            }
            if(!req.getStat().equals("inactive") && !req.getStat().equals("active") && !req.getStat().equals("all"))
            {
                pros.add(implGen.getProfile("active"));
            }
        }

        return new PresRetrieveInfoResponseType(null,null,req.getReqId(),pros,null);
    }

    @RequestMapping(value = "/PreservePO", method = RequestMethod.POST)
    @ResponseBody
    public PresPreservePOResponseType preservePO(@RequestBody(required = false) PresPreservePOType req) throws Exception {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User currentUser= userService.findUserByUsername(userDetails.getUsername()).orElseThrow();

        String reqId = req.getReqId();
        String profileIdentifier = req.getPro();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");


        ProfileGeneratorImpl implGen=new ProfileGeneratorImpl();
        PresProfileType profileActive = implGen.getProfile("active");

        if (!profileIdentifier.equals(profileActive.getPid()))
        {
            throw new Exception("Profile is not active");
        }

        List<PresPOType> objectList = req.getPo();
        List<PresPOType> responseObjects = new ArrayList<PresPOType>();
        for (PresPOType po: objectList) {
            String binaryData = po.getBinaryData().getValue();
            byte[] decodedBytes = Base64.getDecoder().decode(binaryData);
            List<XmlBasicBuildingBlocks> blocks= PdfValidatorCustom.validateBytes(decodedBytes);

            if(!blocks.isEmpty())
            {
                for(XmlBasicBuildingBlocks block : blocks)
                {
                    if(!block.getConclusion().getIndication().toString().equals("PASSED"))
                    {
                        throw new Exception("Pdf not valid");
                    }
                }

                DSSDocument toExtendDocument = new InMemoryDocument(decodedBytes);
                PAdESSignatureParameters parameters = new PAdESSignatureParameters();
                parameters.setSignatureLevel(SignatureLevel.PAdES_BASELINE_LTA);


                CommonCertificateVerifier cv = new CommonCertificateVerifier();
                cv.setTrustedCertSources(LoadedCerts.getInstance().trustedCertSource);
                cv.setOcspSource(new OnlineOCSPSource());
                cv.setCrlSource(new OnlineCRLSource());
                cv.setAIASource(new DefaultAIASource());
                cv.addTrustedCertSources();

                PAdESService pAdESService = new PAdESService(cv);
                final String tspServer = "http://pki.codegic.com/codegic-service/timestamp";
                OnlineTSPSource tspSource = new OnlineTSPSource(tspServer);
                tspSource.setNonceSource(new SecureRandomNonceSource());
                tspSource.setPolicyOid("1.2.1");

                pAdESService.setTspSource(tspSource);
                DSSDocument ltaLevelDocument = pAdESService.extendDocument(toExtendDocument, parameters);

                //work in db
                Document docRetrieved;
                if(po.getId() != "" && po.getId() != null && po.getId() != "string")
                {
                    docRetrieved = documentService.getById(Long.parseLong(po.getId(),10));
                    Set<Certificate> certs = docRetrieved.getCertificates();
                    for (Certificate cert:certs) {
                        certificateService.deleteCertificate(cert);
                    }
                    docRetrieved.setDocumentAlgorithms(new HashSet<Algorithm>());
                }
                else
                {
                    Document doc = new Document(currentUser, UUID.randomUUID().toString());
                    docRetrieved = documentService.saveDocument(doc);
//                    ContractGen contr = ContractInteraction.getInstance().contractGen;
//                    TransactionReceipt receipt = contr.addUserSubmittedDoc(BigInteger.valueOf(currentUser.getId()),BigInteger.valueOf(docRetrieved.getId())).send();
//                    Trans trans = new Trans(receipt.getTransactionHash(),new Date(),currentUser,docRetrieved);
//                    Trans transRetrieved = transService.saveTrans(trans);
                    DocumentHash contr = ContractInteraction.getInstance().contractGen;
                    try (InputStream inputStream = ltaLevelDocument.openStream()) {
                        byte[] contentBytes = new byte[inputStream.available()];
                        inputStream.read(contentBytes);
                        MessageDigest digest = MessageDigest.getInstance("SHA-256");
                        byte[] encodedHash = digest.digest(contentBytes);
                        TransactionReceipt receipt = contr.addUserSubmittedDoc(BigInteger.valueOf(currentUser.getId()),encodedHash).send();
                        Trans trans = new Trans(receipt.getTransactionHash(),new Date(),currentUser,docRetrieved);
                        Trans transRetrieved = transService.saveTrans(trans);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


               PDFDocumentValidator val = PdfValidatorCustom.getValidator(decodedBytes);
               List<AdvancedSignature> signaturesList = val.getSignatures();

                Set<Algorithm> algSet = new HashSet<Algorithm>();
                Set<Certificate> certSet = new HashSet<Certificate>();
                for (AdvancedSignature as : signaturesList) {
                    String signatureAlgName = as.getSignatureAlgorithm().toString();
                    Algorithm algorithm = algorithmService.findAlgorithmByName(signatureAlgName);
                    if(algorithm == null)
                    {
                        Set<Document> docs = new HashSet<>();
                        docs.add(docRetrieved);
                        Algorithm algNew = new Algorithm(signatureAlgName, false, docs);
                        Algorithm alg_saved = algorithmService.saveAlgorithm(algNew);
                        algSet.add(alg_saved);
                    }
                    else
                    {
                        algorithm.addDoc(docRetrieved);
                        algorithmService.saveAlgorithm(algorithm);
                        algSet.add(algorithm);
                    }
                    //Treat TIMESTAMP
                    List<TimestampToken> timestampTokens = as.getAllTimestamps();
                    for (TimestampToken tt: timestampTokens) {
                        List<CertificateToken> tokenCert = tt.getCertificates();
                        for (CertificateToken ct : tokenCert) {
                            Certificate cert = new Certificate(ct.getIssuer().getPrettyPrintRFC2253(),ct.getNotAfter(),docRetrieved);
                            Certificate certRetrieved = certificateService.saveCertificate(cert);
                            certSet.add(certRetrieved);
                        }
                        if(tt.getSignatureAlgorithm()!=null)
                        {
                            String algName = tt.getSignatureAlgorithm().toString();
                            Algorithm algorithm2 = algorithmService.findAlgorithmByName(signatureAlgName);
                            if(algorithm2 == null)
                            {
                                Set<Document> docs = new HashSet<>();
                                docs.add(docRetrieved);
                                Algorithm algNew = new Algorithm(signatureAlgName, false, docs);
                                Algorithm alg_saved = algorithmService.saveAlgorithm(algNew);
                                algSet.add(alg_saved);
                            }
                            else
                            {
                                algorithm2.addDoc(docRetrieved);
                                algorithmService.saveAlgorithm(algorithm2);
                                algSet.add(algorithm2);
                            }
                        }

                    }

                    List<CertificateToken> certificatesSource = as.getCertificates();

                    for (CertificateToken ct : certificatesSource) {
                        Certificate cert = new Certificate(ct.getIssuer().getPrettyPrintRFC2253(),ct.getNotAfter(),docRetrieved);
                        Certificate certRetrieved = certificateService.saveCertificate(cert);
                        certSet.add(certRetrieved);
                    }

                }

                docRetrieved.setDocumentAlgorithms(algSet);
                docRetrieved.setCertificates(certSet);
                documentService.updateDocument(docRetrieved,docRetrieved.getId());

                try (InputStream inputStream = ltaLevelDocument.openStream()) {
                    byte[] contentBytes = new byte[inputStream.available()];
                    inputStream.read(contentBytes);
                    String contentAsStringEncoded = Base64.getEncoder().encodeToString(contentBytes);
                    PresPOType objForResp = new PresPOType(new PresPOTypeBinaryData(contentAsStringEncoded,null)
                            , new PresPOTypeXmlData((""),null),"","",""
                            ,String.valueOf(docRetrieved.getId()),new ArrayList<String>(),null);
                    responseObjects.add(objForResp);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else
                throw new Exception("Signature not valid for one object");

        }
        return new PresPreservePOResponseType(null,null,reqId, "",responseObjects,null);

    }


    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws CertificateException, IOException {

        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a file to upload");
            return "features";
        }

        try {
            // Get the file bytes

            byte[] bytes = file.getBytes();
            model.addAttribute("message", "File uploaded successfully");



            List<XmlBasicBuildingBlocks> blocks= PdfValidatorCustom.validateBytes(bytes);
            if(blocks!=null)
            {
                model.addAttribute("render",1);
                for(XmlBasicBuildingBlocks block:blocks)
                {
                    if(block.getType().toString()=="SIGNATURE")
                    {
                        model.addAttribute("block",block);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "Failed to upload file");
        }

        return "features";
    }

}
