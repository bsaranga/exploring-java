package com.pluralsight.conference;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ConferenceSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/anonymous*").anonymous()
            .antMatchers("/login*").permitAll()
            .antMatchers("/assets/css/**", "assets/js/**", "assets/images/**").permitAll()
            .antMatchers("/index*").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .loginProcessingUrl("/perform_login")
            .defaultSuccessUrl("/", true);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // In memory authentication
        /* auth.inMemoryAuthentication()
            .withUser("saranga")
            .password(passwordEncoder().encode("root"))
            .roles("USER"); */

        // database authentication
        /* auth.jdbcAuthentication().dataSource(dataSource); */

        // ldap authentication
        auth.ldapAuthentication()
            .userDnPatterns("uid={0},ou=people")
            .groupSearchBase("ou=groups")
            .contextSource()
            .url("ldap://localhost:8389/dc=pluralsight,dc=com")
            .and()
            .passwordCompare()
            .passwordEncoder(passwordEncoder())
            .passwordAttribute("userPassword");
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
