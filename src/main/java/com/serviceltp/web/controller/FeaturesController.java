package com.serviceltp.web.controller;

import com.serviceltp.web.JwtService;
import com.serviceltp.web.PdfValidatorCustom;
import com.serviceltp.web.ProfileGeneratorImpl;
import com.serviceltp.web.base.*;

import eu.europa.esig.dss.detailedreport.jaxb.XmlBasicBuildingBlocks;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    public String preservePO(@RequestBody(required = false) PresPreservePOType req)
    {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = userDetails.getUsername();
        return username;
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
