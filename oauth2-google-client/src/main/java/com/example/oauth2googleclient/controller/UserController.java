package com.example.oauth2googleclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
class UserController {

    @RequestMapping("/")
    public String home(Principal user) {
        return "Hello " + user.getName();

    }

}