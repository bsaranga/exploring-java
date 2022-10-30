package com.example.Exceptions;

public class InvalidEmployeeNumber extends Exception {
    public InvalidEmployeeNumber() {
        super("Invalid employee number, please make sure the employee number is only numbers and the length is only 5 characters.");
    }
}
