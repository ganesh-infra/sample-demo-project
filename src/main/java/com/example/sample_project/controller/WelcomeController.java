package com.example.sample_project.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    private static final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    // UI redirect
    @GetMapping("/health")
    public String redirectToUI() {
        log.info("Redirecting to UI");
        return "redirect:/";
    }

    // Optional pure health API (for Jenkins / Docker)
    @GetMapping("/api/health")
    @ResponseBody
    public String apiHealth() {
        return "Application is running";
    }
}
