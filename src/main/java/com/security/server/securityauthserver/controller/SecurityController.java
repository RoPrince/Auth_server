package com.security.server.securityauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello World";
    }
}
