package com.example.demo.Models;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
    
    @NotNull(message = "First name shouldn\'t be empty.")
    @Size(min = 2, message = "First name must be atleast 2 characters.")
    private String firstName;
    @NotNull(message = "Last name shouldn\'t be empty.")
    @Size(min = 2, message = "Second name must be atleast 2 characters.")
    private String lastName;

    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    @Min(value = 0, message = "must be greater than or equal to zero.")
    @Max(value = 10, message = "must be less than or equal to 10.")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message="only 5 chars or digits allowed")
    private String postalCode;

    private LinkedHashMap<String, String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();
        
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("LK", "Sri Lanka");

        favoriteLanguageOptions = new LinkedHashMap<String, String>();

        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("Ruby", "Ruby");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("Scala", "Scala");
        favoriteLanguageOptions.put("C#", "C#");
    }
    
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
