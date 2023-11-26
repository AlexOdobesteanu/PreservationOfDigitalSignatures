package com.serviceltp.web.controller;

import com.serviceltp.web.PdfValidatorCustom;
import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import eu.europa.esig.dss.detailedreport.jaxb.XmlDetailedReport;
import eu.europa.esig.dss.model.DSSDocument;

import eu.europa.esig.dss.model.InMemoryDocument;
import eu.europa.esig.dss.pades.validation.PDFDocumentValidator;
import eu.europa.esig.dss.pdf.PDFSignatureService;
import eu.europa.esig.dss.policy.ValidationPolicyFacade;
import eu.europa.esig.dss.validation.*;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.utils.guava.impl.GoogleGuavaUtils;
import eu.europa.esig.dss.utils.Utils;
import eu.europa.esig.dss.validation.executor.ValidationLevel;
import eu.europa.esig.dss.validation.process.vpfswatsp.ValidationProcessForSignaturesWithArchivalData;
import eu.europa.esig.dss.validation.reports.Reports;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.DocumentType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

@Controller
public class FeaturesController{
     protected PdfValidatorCustom pdfValidator=new PdfValidatorCustom();
    //show upload form
    @GetMapping("/features")
    public String features()
    {
        return "features";
    }


    @RequestMapping("/upload")
    @PostMapping
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {

        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a file to upload");
            return "features";
        }

        try {
            // Get the file bytes

            byte[] bytes = file.getBytes();
            model.addAttribute("message", "File uploaded successfully");

            List<XmlBasicBuildingBlocks> blocks= pdfValidator.validateBytes(bytes);
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
