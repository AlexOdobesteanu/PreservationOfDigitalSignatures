package com.serviceltp.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.serviceltp.web.JwtService;
import com.serviceltp.web.LoadedCerts;
import com.serviceltp.web.PdfValidatorCustom;
import com.serviceltp.web.ProfileGeneratorImpl;
import com.serviceltp.web.base.*;

import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.enumerations.SignatureLevel;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.DigestDocument;
import eu.europa.esig.dss.model.FileDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.pades.PAdESSignatureParameters;
import eu.europa.esig.dss.pades.signature.PAdESService;
import eu.europa.esig.dss.service.SecureRandomNonceSource;
import eu.europa.esig.dss.service.crl.OnlineCRLSource;
import eu.europa.esig.dss.service.ocsp.OnlineOCSPSource;
import eu.europa.esig.dss.service.tsp.OnlineTSPSource;
import eu.europa.esig.dss.spi.x509.aia.DefaultAIASource;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.*;

@RestController
//@Controller
public class FeaturesController{

    private JwtService jwtService;
    private UserDetailsService userDetailsService;
    //show upload form
    @GetMapping("/features")
    public String features()
    {
        return "features";
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
    public String preservePO(@RequestBody(required = false) PresPreservePOType req) throws Exception {
        String reqId = req.getReqId();
        String profileIdentifier = req.getPro();

        ProfileGeneratorImpl implGen=new ProfileGeneratorImpl();
        PresProfileType profileActive = implGen.getProfile("active");

        if (!profileIdentifier.equals(profileActive.getPid()))
        {
            throw new Exception("Profile is not active");
        }

        //Decode from base64
//        ObjectMapper mapper = new ObjectMapper();
//        String decoded = mapper.convertValue("encoded HERE", String.class);

        List<PresPOType> objectList = req.getPo();

        for (PresPOType po: objectList) {
            String binaryData = po.getBinaryData().getValue();
            byte[] decodedBytes = Base64.getDecoder().decode(binaryData);
            List<XmlBasicBuildingBlocks> blocks= PdfValidatorCustom.validateBytes(decodedBytes);
            if(blocks!=null)
            {
                for(XmlBasicBuildingBlocks block:blocks)
                {
                    if(block.getType().toString()=="SIGNATURE")
                    {
                        if (block.getConclusion().getIndication().toString().equals("PASSED"))
                        {
                            // VALID SIGNATURE

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
//                            tspSource.setPolicyOid("0.4.0.2023.1.1"); // NOOOOOOOT SUREEEEEEEEE

                            pAdESService.setTspSource(tspSource);

                            DSSDocument ltaLevelDocument = pAdESService.extendDocument(toExtendDocument, parameters);

                            try (InputStream inputStream = ltaLevelDocument.openStream()) {
                                byte[] contentBytes = new byte[inputStream.available()];
                                inputStream.read(contentBytes);
                                // Assuming content is text, you can convert it to a String
//                                String contentAsString = new String(contentBytes);
                                String contentAsString = Base64.getEncoder().encodeToString(contentBytes);

                                PrintWriter writer = new PrintWriter("output.txt");
                                writer.print(contentAsString);
                                writer.close();

//                                System.out.println("Content of the DSS Document: " + contentAsString);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        else
                            throw new Exception("Signature not valid for one object");
                    }
                }
            }

        }

//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        String username = userDetails.getUsername();
//        return username;
        return "alex";
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
