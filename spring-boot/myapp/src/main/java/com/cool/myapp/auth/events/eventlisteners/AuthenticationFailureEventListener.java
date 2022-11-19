package com.cool.myapp.auth.events.eventlisteners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.services.LoginAttemptService;

@Service
public class AuthenticationFailureEventListener implements ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

    @Autowired
    private LoginAttemptService loginAttemptService;

    @Override
    public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent event) {
        
        String username = (String) event.getAuthentication().getPrincipal();
        loginAttemptService.loginFailed(username);
    }
    
}
