package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot with Thymeleaf!");
        return "index"; // This must match your HTML file name: index.html
    }
}
