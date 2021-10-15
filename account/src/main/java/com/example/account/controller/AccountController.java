package com.example.account.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Value("${spring.cloud.sever.test}")
    String profile;

    @GetMapping("/status")
    public String getStatus(){
        return "Account service is started with: " + profile;
    }

}
