package com.cool.myapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cool.myapp.entities.Employee;
import com.cool.myapp.repositories.IEmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    private IEmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeRestController(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }
}
