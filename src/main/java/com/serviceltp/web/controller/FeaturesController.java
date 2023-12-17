package com.serviceltp.web.controller;

import com.serviceltp.web.ProfileGeneratorImpl;
import com.serviceltp.web.base.*;

import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.*;

@RestController
public class FeaturesController{

    //show upload form
//    @GetMapping("/features")
//    public String features()
//    {
//        return "features";
//    }

    @RequestMapping(value = "/RetrieveInfo", method = RequestMethod.POST)
    @ResponseBody
    public PresRetrieveInfoResponseType retrieveInfo(@RequestBody(required = false) PresRetrieveInfoType req) throws URISyntaxException, ParseException {

        List<PresProfileType> pros = new ArrayList<PresProfileType>();
        ProfileGeneratorImpl implGen=new ProfileGeneratorImpl();
        if(req.getPro()!=null && req.getPro() != "")
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


//    @PostMapping("/upload")
//    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws CertificateException {
//        return file.getOriginalFilename();

//        if (file.isEmpty()) {
//            model.addAttribute("message", "Please select a file to upload");
//            return "features";
//        }
//
//        try {
//            // Get the file bytes
//
//            byte[] bytes = file.getBytes();
//            model.addAttribute("message", "File uploaded successfully");
//
//
//
//            List<XmlBasicBuildingBlocks> blocks= PdfValidatorCustom.validateBytes(bytes);
//            if(blocks!=null)
//            {
//                model.addAttribute("render",1);
//                for(XmlBasicBuildingBlocks block:blocks)
//                {
//                    if(block.getType().toString()=="SIGNATURE")
//                    {
//                        model.addAttribute("block",block);
//                    }
//                }
//            }
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//            model.addAttribute("message", "Failed to upload file");
//        }
//
//        return "features";
//    }

}
