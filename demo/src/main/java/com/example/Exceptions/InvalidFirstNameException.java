package com.example.Exceptions;

public class InvalidFirstNameException extends Exception {
    
    public InvalidFirstNameException() {
        super("Invalid first name, please enter a valid first name");
    }
    
}
