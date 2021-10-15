package com.example.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${spring.cloud.sever.test}")
    String profile;

    @GetMapping("/status")
    public String getStatus(){
        return "User service started with: " + profile;
    }
}
