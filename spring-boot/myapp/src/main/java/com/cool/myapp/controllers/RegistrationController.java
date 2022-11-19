package com.cool.myapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cool.myapp.auth.dtos.UserDto;
import com.cool.myapp.auth.services.interfaces.IUserService;

@Controller
public class RegistrationController {
    
    @Autowired
    private IUserService defaultUserService;

    @GetMapping("/adduser")
    public String register(Model model) {
        model.addAttribute("user", new UserDto());
        return "add-user";
    }

    @PostMapping("/adduser")
    public String register(@Valid @ModelAttribute("user") UserDto userDto, BindingResult result) {
        if (result.hasErrors()) {
            return "add-user";
        }

        defaultUserService.createUser(userDto);
        return "redirect:adduser?success";
    }
}
