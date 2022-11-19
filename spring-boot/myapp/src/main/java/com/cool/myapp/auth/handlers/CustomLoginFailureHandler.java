package com.cool.myapp.auth.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
public class CustomLoginFailureHandler {

    private DefaultRedirectStrategy defaultRedirectStrategy = new DefaultRedirectStrategy();
    
    @Bean
    public AuthenticationFailureHandler getAuthFailureHandler() {
        
        AuthenticationFailureHandler authFailHandler = new AuthenticationFailureHandler(){
            
            @Override
            public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                    AuthenticationException exception) throws IOException, ServletException {
                System.out.println("LOGIN FAILURE");

                if (exception instanceof DisabledException) {
                    defaultRedirectStrategy.sendRedirect(request, response, "/login-disabled");
                    return;
                }
                defaultRedirectStrategy.sendRedirect(request, response, "/login-error");
            }
        };

        return authFailHandler;
    }
}
