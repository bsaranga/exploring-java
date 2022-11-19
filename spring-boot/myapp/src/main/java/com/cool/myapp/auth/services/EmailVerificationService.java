package com.cool.myapp.auth.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.entities.EmailVerification;
import com.cool.myapp.auth.repo.EmailVerificationRepository;

@Service
public class EmailVerificationService {
    
    @Autowired
    private EmailVerificationRepository emailVerificationRepository;

    public String generateVerification (String username) {
        
        if (!emailVerificationRepository.existsByUserName(username)) {
            EmailVerification verification = new EmailVerification(username);
            verification = emailVerificationRepository.save(verification);

            return verification.getVerificationId();
        }

        return getVerificationIdByUsername(username);
    }

    public String getVerificationIdByUsername (String username) {
        EmailVerification verification = emailVerificationRepository.findByUserName(username);
        if (verification != null)
            return verification.getVerificationId();
        return null;
    }

    public String getUsernameForVerificationId (String verificationId) {
        Optional<EmailVerification> verification = emailVerificationRepository.findById(verificationId);
        if (verification.isPresent())
            return verification.get().getUserName();
        return null;
    }
}
