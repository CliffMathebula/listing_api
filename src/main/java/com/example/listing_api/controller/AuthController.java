package com.example.listing_api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, secured World!";
    }

    
}
