package com.cool.myapp.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.entities.ApplicationUser;
import com.cool.myapp.auth.services.interfaces.IUserService;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService defaultUserService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        System.out.println("LOADING USER BY USERNAME");

        ApplicationUser applicationUser = defaultUserService.findByUserName(userName);
        
        if (applicationUser == null) throw new UsernameNotFoundException(String.format("No user with username %s exists in the system", userName));
        
        return User.builder()
                .username(applicationUser.getUserName())
                .password(applicationUser.getPassword())
                .disabled(!applicationUser.isVerified())
                .accountExpired(applicationUser.isAccountCredentialExpired())
                .accountLocked(applicationUser.isLocked())
                .roles("USER", "ADMIN", "COM")
                .build();
    }
    
}
