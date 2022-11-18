package com.cool.myapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {
    
    @GetMapping(value="/")
    public String sayHello() {
        return String.format("Local server time is: %s", LocalDate.now());
    }
    
}
