package com.cool.myapp.repositories;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cool.myapp.entities.Employee;

@Repository
public class EmployeeHibernateRepository implements IEmployeeRepository{

    private EntityManager entityManager;

    @Autowired
    public EmployeeHibernateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> readAllEmployeesQuery = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employees = readAllEmployeesQuery.getResultList();

        return employees;
    }
    
}
