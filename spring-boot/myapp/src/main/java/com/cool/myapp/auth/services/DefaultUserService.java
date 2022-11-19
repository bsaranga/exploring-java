package com.cool.myapp.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cool.myapp.auth.dtos.UserDto;
import com.cool.myapp.auth.entities.ApplicationUser;
import com.cool.myapp.auth.repo.ApplicationUserRepository;
import com.cool.myapp.auth.services.interfaces.IUserService;

@Service
public class DefaultUserService implements IUserService {

    @Autowired
    private ApplicationUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ApplicationUser createUser(UserDto userDto) {
        
        ApplicationUser applicationUser = new ApplicationUser(
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getUserName(),
            userDto.getEmail(),
            passwordEncoder.encode(userDto.getPassword()),
            false,
            false,
            false
        );

        return userRepository.save(applicationUser);
    }

    @Override
    public ApplicationUser findByUserName(String userName) {
        
        return userRepository.findByUserName(userName);
    }
    
}
