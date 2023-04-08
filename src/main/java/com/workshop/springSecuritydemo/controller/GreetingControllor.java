package com.workshop.springSecuritydemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingControllor {

    @GetMapping
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("Goodluck");
    }
}
