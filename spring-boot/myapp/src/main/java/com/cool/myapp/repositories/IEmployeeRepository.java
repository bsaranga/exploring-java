package com.cool.myapp.repositories;

import java.util.List;

import com.cool.myapp.entities.Employee;

public interface IEmployeeRepository {
    
    public List<Employee> findAll();
}
