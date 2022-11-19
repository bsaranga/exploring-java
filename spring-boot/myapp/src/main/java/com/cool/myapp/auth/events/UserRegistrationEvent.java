package com.cool.myapp.auth.events;

import org.springframework.context.ApplicationEvent;
import com.cool.myapp.auth.entities.ApplicationUser;

public class UserRegistrationEvent extends ApplicationEvent {

	private ApplicationUser applicationUser;
    private static final long serialVersionUID = -2685172945219633123L;
    
    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public UserRegistrationEvent(ApplicationUser applicationUser) {
        super(applicationUser);
        this.applicationUser = applicationUser;
    }
    
}
