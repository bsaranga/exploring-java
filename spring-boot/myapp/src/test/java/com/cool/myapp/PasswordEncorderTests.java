package com.cool.myapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordEncorderTests {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void checkPasswordEncoding() {
        System.out.println(passwordEncoder.encode("user"));
        assertTrue(true);
    }
}
