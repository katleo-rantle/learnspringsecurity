package com.katleo.learnspringsecurity.ch01_basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "hello";
    }
}
