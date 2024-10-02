package com.javaapp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaapp.demo.model.Users;
import com.javaapp.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/login")
    public String login() {
        return "Hey you logged in";
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);
    }
}
