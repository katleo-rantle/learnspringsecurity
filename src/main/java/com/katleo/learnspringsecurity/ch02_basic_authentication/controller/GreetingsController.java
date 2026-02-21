package com.katleo.learnspringsecurity.ch02_basic_authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(path = "/hi")
    public String sayHello(){
        return "<h1>Hi there!</h1>";
    }
}
