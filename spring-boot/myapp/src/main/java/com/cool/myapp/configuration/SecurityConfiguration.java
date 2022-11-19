package com.cool.myapp.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private AccessDeniedHandler customAccessDeniedHandler;
    
    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {

        http.authorizeRequests()
            .antMatchers("/").permitAll()
            .antMatchers("/login").permitAll()
            .antMatchers("/admin").hasRole("ADMIN")
            .antMatchers("/common").hasRole("COM")
            .antMatchers("/guest").hasRole("GUEST")
            .anyRequest().authenticated()
            .and()
            .formLogin().loginPage("/login")
            .and()
            .exceptionHandling().accessDeniedHandler(customAccessDeniedHandler);

        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().antMatchers("/css/**");
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        
        List<UserDetails> users = new ArrayList<>();

        UserDetails adminUser = User.withDefaultPasswordEncoder()
                                    .username("admin")
                                    .password("admin")
                                    .roles("ADMIN", "COM")
                                    .build();

        UserDetails guestUser = User.withDefaultPasswordEncoder()
                                    .username("guest")
                                    .password("guest")
                                    .roles("GUEST", "COM")
                                    .build();
        users.add(adminUser);
        users.add(guestUser);

        return new InMemoryUserDetailsManager(users);
    }

    private String getEncodedPassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
