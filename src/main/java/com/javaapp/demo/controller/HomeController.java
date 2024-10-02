package com.javaapp.demo.controller;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("hi there...");
        return "Welcome to ak page";
    }

}
