package com.cool.myapp.auth.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cool.myapp.auth.entities.ApplicationUser;

@Repository
public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
    
    // Custom method
    // More info: https://www.concretepage.com/spring-5/spring-data-crudrepository-example#Methods
    ApplicationUser findByUserName (String userName);
}
