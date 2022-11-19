package com.cool.myapp.auth.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cool.myapp.auth.entities.EmailVerification;

@Repository
public interface EmailVerificationRepository extends CrudRepository<EmailVerification, String>{
    
    EmailVerification findByUserName(String userName);
    boolean existsByUserName(String userName);
}
