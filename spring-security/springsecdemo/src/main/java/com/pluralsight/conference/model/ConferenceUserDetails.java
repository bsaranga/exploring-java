package com.pluralsight.conference.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class ConferenceUserDetails extends org.springframework.security.core.userdetails.User {

    private String nickname;
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ConferenceUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        //TODO Auto-generated constructor stub
    }
    
}
