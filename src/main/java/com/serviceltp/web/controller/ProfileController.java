package com.serviceltp.web.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.data.repository.init.ResourceReader.Type.JSON;


@Controller
public class ProfileController {

    private String profileData="""
{
  "data": {
    "x": "1",
    "y": "1",
    "url": "http://url.com"
  },
  "event": "start",
  "show": 1,
  "id": 50
}
""";


    @GetMapping("/profile")
    public String profile(Model model)
    {
        model.addAttribute("profileData",profileData);
        return "profile";
    }
}
