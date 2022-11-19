package com.cool.myapp.auth.events.eventlisteners;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.entities.ApplicationUser;
import com.cool.myapp.auth.events.UserRegistrationEvent;
import com.cool.myapp.auth.services.EmailVerificationService;

@Service
public class EmailVerificationListener implements ApplicationListener<UserRegistrationEvent> {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailVerificationService verificationService;

    @Value("${server.port}")
    private String serverPort;

    @Value("${spring.mail.username}")
    private String fromEmail;

    @Override
    public void onApplicationEvent(UserRegistrationEvent event) {
        
        ApplicationUser user = event.getApplicationUser();
        String username = user.getUserName();
        String email = user.getEmail();
        String verificationId = verificationService.generateVerification(username);
        
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("Digital Vision Online Store Account Verification");
        message.setText(getText(user, verificationId));
        message.setFrom(fromEmail);
        message.setTo(email);
        mailSender.send(message);
    }

    private String getText(ApplicationUser user, String verificationId) {
    	String encodedVerificationId = new String(Base64.getEncoder().encode(verificationId.getBytes()));
    	StringBuffer buffer = new StringBuffer();
    	buffer.append("Dear ").append(user.getFirstName()).append(" ").append(user.getLastName()).append(",").append(System.lineSeparator()).append(System.lineSeparator());
    	buffer.append("Your account has been successfully created in the Digital Vision Online Store. ");
    	
    	buffer.append(String.format("Activate your account by clicking the following link: http://localhost:%s/verify/email?id=", serverPort)).append(encodedVerificationId);
    	buffer.append(System.lineSeparator()).append(System.lineSeparator());
    	buffer.append("Regards,").append(System.lineSeparator()).append("Digital Vision Team");
    	return buffer.toString();
    }
    
}
