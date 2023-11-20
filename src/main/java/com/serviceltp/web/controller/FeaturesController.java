package com.serviceltp.web.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FeaturesController{

    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        try {

            String uploadDir = "web/src";



            File transferFile = new File(uploadDir + "/" + file.getOriginalFilename());
            System.out.println(file.getOriginalFilename());
            file.transferTo(transferFile);

        } catch (Exception e) {

            e.printStackTrace();

            return "Failure";
        }

        return "Success";
    }


    @GetMapping("/features")
    public String features()
    {
        return "features";
    }
}
