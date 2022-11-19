package com.cool.myapp.controllers;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cool.myapp.auth.entities.ApplicationUser;
import com.cool.myapp.auth.services.EmailVerificationService;
import com.cool.myapp.auth.services.interfaces.IUserService;

@Controller
public class EmailVerificationController {
    
    @Autowired
    private EmailVerificationService verificationService;
    
    @Autowired
    private IUserService userService;


    @GetMapping("/verify/email")
    public String verifyEmail(@RequestParam String id) {
    	byte[] actualId = Base64.getDecoder().decode(id.getBytes());
        String username = verificationService.getUsernameForVerificationId(new String(actualId));
        if (username != null) {
            ApplicationUser user = userService.findByUserName(username);
            user.setVerified(true);
            userService.save(user);
            return "redirect:/login-verified";
        }
        return "redirect:/login-error";
    }
}
