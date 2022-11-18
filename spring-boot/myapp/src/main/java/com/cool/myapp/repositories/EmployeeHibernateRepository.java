package com.cool.myapp.repositories;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cool.myapp.entities.Employee;

@Repository
public class EmployeeHibernateRepository implements IEmployeeRepository{

    private EntityManager entityManager;

    @Autowired
    public EmployeeHibernateRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> readAllEmployeesQuery = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employees = readAllEmployeesQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int employeeId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee employee = currentSession.get(Employee.class, employeeId);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteById(int employeeId) {
        Session currentSession = entityManager.unwrap(Session.class);
        var deleteQuery = currentSession.createQuery("delete from Employee where id=:employeeId");
        deleteQuery.setParameter("employeeId", employeeId);
        deleteQuery.executeUpdate();
    }
    
}
