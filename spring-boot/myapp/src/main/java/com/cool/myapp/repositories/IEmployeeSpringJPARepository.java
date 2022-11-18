package com.cool.myapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cool.myapp.entities.Employee;

public interface IEmployeeSpringJPARepository extends JpaRepository<Employee, Integer> {

}
