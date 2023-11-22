package com.serviceltp.web.controller;

import eu.europa.esig.dss.pdf.PDFSignatureService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FeaturesController{
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

            // Get the file name
            String fileName = file.getOriginalFilename();

            // Specify the directory to save the file
            Path uploadPath = Paths.get("./src/uploads");
            if (!java.nio.file.Files.exists(uploadPath)) {
                // Create the directory if it doesn't exist
                java.nio.file.Files.createDirectories(uploadPath);
            }

            // Save the file
            Path filePath = Paths.get("./src/uploads/", fileName);
            java.nio.file.Files.write(filePath, bytes);
            

            model.addAttribute("message", "File uploaded successfully");
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "Failed to upload file");
        }

        return "features";
    }

}
