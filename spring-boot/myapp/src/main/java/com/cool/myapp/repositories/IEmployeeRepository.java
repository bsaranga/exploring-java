package com.cool.myapp.repositories;

import java.util.List;

import com.cool.myapp.entities.Employee;

public interface IEmployeeRepository {
    
    public List<Employee> findAll();

    public Employee findById(int employeeId);

    public void save(Employee employee);

    public void deleteById(int employeeId);
}
