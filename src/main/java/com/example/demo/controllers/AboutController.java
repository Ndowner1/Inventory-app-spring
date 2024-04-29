package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String showAboutPage() {
        return "about.html";
    }
}
