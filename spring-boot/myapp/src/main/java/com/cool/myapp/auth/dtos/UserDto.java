package com.cool.myapp.auth.dtos;

import javax.validation.constraints.NotEmpty;

public class UserDto {

    @NotEmpty(message = "Enter your first name")
    private String firstName;
    @NotEmpty(message = "Enter your last name")
    private String lastName;
    @NotEmpty(message = "Enter your user name")
    private String userName;
    @NotEmpty(message = "Enter your email")
    private String email;
    @NotEmpty(message = "Enter your password")
    private String password;
    @NotEmpty(message = "Confirm your password")
    private String confirmPassword;
    
    public UserDto(@NotEmpty(message = "Enter your first name") String firstName,
            @NotEmpty(message = "Enter your last name") String lastName,
            @NotEmpty(message = "Enter your user name") String userName,
            @NotEmpty(message = "Enter your email") String email,
            @NotEmpty(message = "Enter your password") String password,
            @NotEmpty(message = "Confirm your password") String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public UserDto() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", email="
                + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
    }
}
