package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Exceptions.InvalidAgeException;
import com.example.Exceptions.InvalidEmployeeNumber;
import com.example.Exceptions.InvalidFirstNameException;
import com.example.Exceptions.InvalidLastNameException;

public class EmployeeTest {

    @Test(expected = InvalidEmployeeNumber.class)
    public void shouldThrowInvalidEmployeeNumberExceptionIfLessThanOrEqualToZero() throws Exception {
        var employee = new Employee(0, "John", "Doe", 18);
    }

    @Test(expected = InvalidFirstNameException.class)
    public void shouldThrowInvalidFirstNameExceptionIfBlankFirstNameIsUsed() throws Exception {
        var employee = new Employee(1234, "", "Doe", 18);
    }

    @Test(expected = InvalidLastNameException.class)
    public void shouldThrowInvalidLastNameExceptionIfBlankLastNameIsUsed() throws Exception {
        var employee = new Employee(1234, "John", "", 18);
    }

    @Test(expected = InvalidAgeException.class)
    public void shouldThrowInvalidAgeExceptionIfAgeIsLessThan18() throws Exception {
        var employee = new Employee(1234, "John", "Doe", 17);
    }

    @Test()
    public void getFullNameReturnsConcatenatedFirstAndLastName() throws Exception {
        var employee = new Employee(1234, "John", "Doe", 19);
        assertEquals("John Doe", employee.getFullName());
    }

    @Test()
    public void getFirstNameReturnsOnlyFirstName() throws Exception {
        var employee = new Employee(1234, "John", "Doe", 19);
        assertEquals("John", employee.getFirstName());
    }

    @Test()
    public void getLastNameReturnsOnlyLastName() throws Exception {
        var employee = new Employee(1234, "John", "Doe", 19);
        assertEquals("Doe", employee.getLastName());
    }

    @Test()
    public void getAgeReturnsTheAgeAsInteger() throws Exception {
        var employee = new Employee(1234, "John", "Doe", 19);
        
        assertEquals(19, employee.getAge());
        var condition = ((Object) employee.getAge()).getClass().getName() == "Integer";
        assertTrue("Age is not a Integer type", condition);
    }
}
