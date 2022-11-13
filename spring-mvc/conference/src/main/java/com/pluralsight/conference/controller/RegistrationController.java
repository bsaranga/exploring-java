package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pluralsight.conference.model.Registration;

@Controller
public class RegistrationController {
   
   @GetMapping("registration")
   public String getRegistration(@ModelAttribute("registration") Registration registration) {
      return "registration";
   }

   @PostMapping("registration")
   public String addRegistration(@ModelAttribute("registration") Registration registration) {
      System.out.println(registration.getName());
      return "registration";
   }
}
