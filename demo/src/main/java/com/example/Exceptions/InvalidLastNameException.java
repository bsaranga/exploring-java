package com.example.Exceptions;

public class InvalidLastNameException extends Exception {
    
    public InvalidLastNameException() {
        super("Invalid last name, please enter a valid last name");
    }
    
}
