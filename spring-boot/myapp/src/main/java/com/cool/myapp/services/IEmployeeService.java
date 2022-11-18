package com.cool.myapp.services;

import java.util.List;
import com.cool.myapp.entities.Employee;

public interface IEmployeeService {
    
    public List<Employee> findAll();

    public Employee findById(int employeeId);

    public void save(Employee employee);

    public void deleteById(int employeeId);  
}
