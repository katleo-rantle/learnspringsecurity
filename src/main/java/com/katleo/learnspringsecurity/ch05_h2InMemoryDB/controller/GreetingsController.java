package com.katleo.learnspringsecurity.ch05_h2InMemoryDB.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "hello from ch04";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping(path = "/user")
    public String userEndpoint(){
        return "hello user";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(path = "/admin")
    public String adminEndpoint(){
        return "hello admin";
    }
}
