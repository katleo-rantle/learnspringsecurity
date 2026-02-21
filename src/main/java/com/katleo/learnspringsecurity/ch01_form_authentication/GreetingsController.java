package com.katleo.learnspringsecurity.ch01_form_authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "hello";
    }
}
