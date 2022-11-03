package com.example.oauth2googleclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello(){
        return "helloo";
    }

    @GetMapping("/hello")
    public String say2Hello(){
        return "helloo helloo";
    }
}
