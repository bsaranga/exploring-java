package com.example;

import com.example.Exceptions.InvalidAgeException;
import com.example.Exceptions.InvalidEmployeeNumber;
import com.example.Exceptions.InvalidFirstNameException;
import com.example.Exceptions.InvalidLastNameException;

public class Employee {
    
    private int EmployeeNumber;
    private String FirstName;
    private String LastName;
    private int Age;

    public Employee(int EmployeeNumber, String FirstName, String LastName, int Age) throws Exception {
        
        super();

        ValidateEmployeeNumber(EmployeeNumber);
        ValidateFirstName(FirstName);
        ValidateLastName(LastName);
        ValidateAge(Age);

        this.EmployeeNumber = EmployeeNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    // Getters

    public int getEmployeeNumber() {
        return this.EmployeeNumber;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getFullName() {
        return String.format("%s %s", FirstName, LastName);
    }

    public int getAge() {
        return this.Age;
    }

    // Setters

    public void setEmployeeNumber(int EmployeeNumber) throws Exception{
        ValidateEmployeeNumber(EmployeeNumber);
        this.EmployeeNumber = EmployeeNumber;
    }

    public void setName(String FirstName, String LastName) throws Exception {
        ValidateFirstName(FirstName);
        ValidateLastName(LastName);
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void setFirstName(String FirstName) throws Exception {
        ValidateFirstName(FirstName);
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) throws Exception {
        ValidateLastName(LastName);
        this.LastName = LastName;
    }

    public void setAge(int Age) throws Exception {
        ValidateAge(Age);
        this.Age = Age;
    }

    // Validators

    public void ValidateFirstName(String firstName) throws InvalidFirstNameException {
        if (firstName.isEmpty() || firstName.isBlank()) 
            throw new InvalidFirstNameException();
    }

    public void ValidateLastName(String lastName) throws InvalidLastNameException {
        if (lastName.isEmpty() || lastName.isBlank()) 
            throw new InvalidLastNameException();
    }
    
    public void ValidateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 65) 
            throw new InvalidAgeException();
    }

    public void ValidateEmployeeNumber(int employeeNumber) throws InvalidEmployeeNumber {
        if (Integer.toString(employeeNumber).length() > 5 || employeeNumber <= 0)
            throw new InvalidEmployeeNumber();
    }
}
