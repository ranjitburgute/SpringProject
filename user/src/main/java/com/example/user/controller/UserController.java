package com.example.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Value("${spring.cloud.sever.test}")
    String profile;

    @GetMapping("/status")
    public String getStatus(){

        log.info("User service status endpoint");
        return "User service started with: " + profile;
    }
}
