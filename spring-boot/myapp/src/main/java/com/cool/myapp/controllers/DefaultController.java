package com.cool.myapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    
    @GetMapping("/")
    String getIndex() {
        return "index";
    }

    @GetMapping("/admin")
    String getAdminPage() {
        return "admin";
    }

    @GetMapping("/guest")
    String getGuestPage() {
        return "guest";
    }

    @GetMapping("/common")
    String getCommonPage() {
        return "common";
    }

    @GetMapping("accessDenied")
    String getAccessDeniedPage() {
        return "accessDenied";
    }
}
