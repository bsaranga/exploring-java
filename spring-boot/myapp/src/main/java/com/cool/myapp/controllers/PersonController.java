package com.cool.myapp.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cool.myapp.entities.Person;

@Controller
public class PersonController {

    @Value("${info.app.name}")
    private String appName;
    
    @GetMapping
    String getPeople(Model model) {
        
        model.addAttribute("appName", appName);

        model.addAttribute("people", Arrays.asList(
            new Person("John", 22),
            new Person("Sarah", 25),
            new Person("Simon", 27),
            new Person("Phillip", 35),
            new Person("Beky", 45)
        ));

        return "people";
    }
}