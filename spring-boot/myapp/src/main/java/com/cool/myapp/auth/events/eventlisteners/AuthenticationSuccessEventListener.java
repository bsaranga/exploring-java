package com.cool.myapp.auth.events.eventlisteners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.services.LoginAttemptService;

@Service
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent>{
    
    @Autowired
    private LoginAttemptService loginAttemptService;

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        User user = (User) event.getAuthentication().getPrincipal();
        loginAttemptService.loginSuccess(user.getUsername());
    }
    
}
