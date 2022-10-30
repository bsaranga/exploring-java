package com.example.Exceptions;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        super("Invalid age, please enter a valid age.");
    }

}
