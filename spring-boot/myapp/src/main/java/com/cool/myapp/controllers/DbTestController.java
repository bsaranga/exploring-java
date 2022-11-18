package com.cool.myapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DbTestController {

    @Value("${spring.datasource.url}")
    private String connectionString;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
    
    @GetMapping(value="/dbtest")
    public String openTestConnection() throws SQLException{
        return testDbConnection(connectionString, username, password);
    }

    public String testDbConnection(String connectionString, String username, String password) throws SQLException {
        String output = "No value";

        try {
            Connection myConnection = DriverManager.getConnection(connectionString, username, password);
            
            var dbName = myConnection.getMetaData().getDatabaseProductName();
            var dbUrl = myConnection.getMetaData().getURL();

            output = String.format("The database is %s, and the connection URL is %s", dbName, dbUrl);

            myConnection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return output;
    }
    
}
