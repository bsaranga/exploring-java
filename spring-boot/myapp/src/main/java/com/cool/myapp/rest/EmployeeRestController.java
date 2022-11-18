package com.cool.myapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        
        employee.setIdToZero();
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updatEmployee(@RequestBody Employee employee) {
        
        if (employee.getId() < 0) throw new RuntimeException("Employee Id cannot be less than zero");
        if (employee.getId() == 0) throw new RuntimeException("Employee Id cannot be zero");
        
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        var existingEmployee = employeeService.findById(employeeId);
        if (existingEmployee == null)
            throw new RuntimeException("Employee doesn't exist in the database.");

        employeeService.deleteById(employeeId);
        return String.format("%s", existingEmployee.getId());
    }
}
