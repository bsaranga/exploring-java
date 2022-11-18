package com.cool.myapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cool.myapp.entities.Employee;
import com.cool.myapp.services.IEmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    private IEmployeeService employeeService;
    
    @Autowired
    public EmployeeRestController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return this.employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        var employee = this.employeeService.findById(employeeId);
        
        if (employee == null) 
            throw new RuntimeException(String.format("Employee with Id = %s not found.", employeeId));
        
        return employee;
    }
}
