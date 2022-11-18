package com.cool.myapp.repositories;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cool.myapp.entities.Employee;

@Repository
public class EmployeeJPARepository implements IEmployeeRepository{

    private EntityManager entityManager;

    @Autowired
    public EmployeeJPARepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        Query findAllQuery = entityManager.createQuery("from Employee");
        List<Employee> employees = findAllQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int employeeId) {
        Employee employee = entityManager.find(Employee.class, employeeId);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);
        employee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(int employeeId) {
        Query deleteQuery = entityManager.createQuery("delete from Employee where id=:employeeId");
        deleteQuery.setParameter("employeeId", employeeId);
        deleteQuery.executeUpdate();
    }
    
}
