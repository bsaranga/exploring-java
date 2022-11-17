package com.example.demo.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        var theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        
        if (bindingResult.hasErrors()) return "student-form";
        
        System.out.println(String.format("FirstName: %s \nLastName: %s", student.getFirstName(), student.getLastName()));
        return "student-confirmation";
    }
}
