package com.example.oauth2googleclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
class UserController {

    @GetMapping
    public Principal home(Principal user) {
        return user;

    }

}