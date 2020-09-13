package com.canopus.jwtauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
