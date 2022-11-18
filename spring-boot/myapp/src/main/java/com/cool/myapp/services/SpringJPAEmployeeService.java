package com.cool.myapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cool.myapp.entities.Employee;
import com.cool.myapp.repositories.IEmployeeSpringJPARepository;

@Service
public class SpringJPAEmployeeService implements IEmployeeService {

    private IEmployeeSpringJPARepository employeeSpringJPARepository;

    @Autowired
    public SpringJPAEmployeeService(IEmployeeSpringJPARepository employeeSpringJPARepository) {
        this.employeeSpringJPARepository = employeeSpringJPARepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeSpringJPARepository.findAll();
    }

    @Override
    public Employee findById(int employeeId) {
        var result = employeeSpringJPARepository.findById(employeeId);

        if (result.isPresent())
            return result.get();
        else throw new RuntimeException(String.format("Did not find employee with Id: %s", employeeId));
    }

    @Override
    public void save(Employee employee) {
        employeeSpringJPARepository.save(employee);
        
    }

    @Override
    public void deleteById(int employeeId) {
        employeeSpringJPARepository.deleteById(employeeId);
    }
    
}
