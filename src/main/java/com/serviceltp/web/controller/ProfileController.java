package com.serviceltp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {
    private String profileData;

    @GetMapping("/profile")
    public String profile()
    {
        return "profile";
    }
}
