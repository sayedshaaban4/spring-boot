package com.sayed.springBoot.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/")
    public String helloWorld() {
        return "Welcome Sayed_4";
    }
}
