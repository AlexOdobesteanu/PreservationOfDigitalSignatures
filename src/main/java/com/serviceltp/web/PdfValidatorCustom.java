package com.serviceltp.web;

import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.detailedreport.jaxb.XmlDetailedReport;
import eu.europa.esig.dss.model.DSSDocument;
import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.pades.validation.PDFDocumentValidator;
import eu.europa.esig.dss.validation.CommonCertificateVerifier;
import eu.europa.esig.dss.validation.OriginalIdentifierProvider;
import eu.europa.esig.dss.validation.SignaturePolicyProvider;
import eu.europa.esig.dss.validation.executor.ValidationLevel;
import eu.europa.esig.dss.validation.reports.Reports;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;

public class PdfValidatorCustom {

    public PdfValidatorCustom() {

    }
    public List<XmlBasicBuildingBlocks> validateBytes (byte[] bytes)
    {
        Locale locale = Locale.getDefault();
        //Create validator
        PDFDocumentValidator validator= new PDFDocumentValidator(new InMemoryDocument(bytes));

        //Set validator
        validator.setCertificateVerifier(new CommonCertificateVerifier());
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
}
