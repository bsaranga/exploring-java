package com.cool.myapp.auth.services.interfaces;

import com.cool.myapp.auth.dtos.UserDto;
import com.cool.myapp.auth.entities.ApplicationUser;

public interface IUserService {
    
    ApplicationUser createUser(UserDto userDto);
    ApplicationUser findByUserName(String userName);
    ApplicationUser save(ApplicationUser user);
}
