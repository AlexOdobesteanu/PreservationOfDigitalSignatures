package com.serviceltp.web;

import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.detailedreport.jaxb.XmlDetailedReport;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.model.x509.CertificateToken;
import eu.europa.esig.dss.pades.validation.PAdESCRLSource;
import eu.europa.esig.dss.pades.validation.PAdESCertificateSource;
import eu.europa.esig.dss.pades.validation.PDFDocumentValidator;
import eu.europa.esig.dss.service.crl.OnlineCRLSource;
import eu.europa.esig.dss.service.http.commons.OCSPDataLoader;
import eu.europa.esig.dss.service.ocsp.OnlineOCSPSource;
import eu.europa.esig.dss.model.x509.revocation.ocsp.OCSP;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import eu.europa.esig.dss.spi.tsl.TrustedListsCertificateSource;
import eu.europa.esig.dss.spi.x509.CommonTrustedCertificateSource;
import eu.europa.esig.dss.spi.x509.aia.DefaultAIASource;
import eu.europa.esig.dss.spi.x509.revocation.RevocationSource;
import eu.europa.esig.dss.spi.x509.revocation.ocsp.OCSPCertificateSource;
import eu.europa.esig.dss.spi.x509.revocation.ocsp.OCSPSource;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import eu.europa.esig.dss.validation.OriginalIdentifierProvider;
import eu.europa.esig.dss.validation.SignaturePolicyProvider;
import eu.europa.esig.dss.validation.executor.ValidationLevel;
import eu.europa.esig.dss.validation.reports.Reports;
import org.bouncycastle.asn1.esf.OcspIdentifier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.cert.X509Certificate;

public class PdfValidatorCustom {


    public PdfValidatorCustom() {


    }
    static public List<XmlBasicBuildingBlocks> validateBytes (byte[] bytes) throws IOException, CertificateException {
        Locale locale = Locale.getDefault();
        //Create validator
        PDFDocumentValidator validator= new PDFDocumentValidator(new InMemoryDocument(bytes));


        CommonCertificateVerifier cv=new CommonCertificateVerifier();

//        Path filePath=Paths.get("sts_qualified_ca.crt");
//
//
//        System.out.println(Paths.get(".").toAbsolutePath());
//        byte[] fileBytes=Files.readAllBytes(filePath);
//        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
//        ByteArrayInputStream inputStream=new ByteArrayInputStream(fileBytes);
//        X509Certificate x509cert=(X509Certificate) certificateFactory.generateCertificate(inputStream);
//        CertificateToken certToken=new CertificateToken(x509cert);
//
//
//        trustedCertSource.addCertificate(certToken);
        cv.setTrustedCertSources(LoadedCerts.getInstance().trustedCertSource);
        cv.setOcspSource(new OnlineOCSPSource());
        cv.setCrlSource(new OnlineCRLSource());
        cv.setAIASource(new DefaultAIASource());
        cv.addTrustedCertSources();


        //Set validator
        validator.setCertificateVerifier(cv);

        validator.setSignaturePolicyProvider(new SignaturePolicyProvider());
        validator.setTokenIdentifierProvider(new OriginalIdentifierProvider());
        validator.setValidationLevel(ValidationLevel.ARCHIVAL_DATA);

        validator.setLocale(locale);

//        try {
//            Path file=Paths.get("./report.xml");
//            Files.write(file, validator.validateDocument().getXmlDetailedReport().getBytes());
//            System.out.println(validator.validateDocument().getXmlValidationReport());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        //Get XmlDetailedReport object
        XmlDetailedReport rep =validator.validateDocument().getDetailedReportJaxb();
        return rep.getBasicBuildingBlocks();
    }

    // Create URI with exception handling
    private static URI createUri(String uriString) {
        try {
            return new URI(uriString);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URI: " + uriString, e);
        }
    }
}

