package com.cool.myapp.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cool.myapp.entities.Employee;
import com.cool.myapp.repositories.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService{

    private IEmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(IEmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
    
}
