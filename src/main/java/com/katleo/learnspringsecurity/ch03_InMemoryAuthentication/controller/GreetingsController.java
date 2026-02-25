package com.katleo.learnspringsecurity.ch03_InMemoryAuthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "hello from ch03";
    }
}
