package io.conference.model;

public class Speaker {
    
    private String firstName;
    private String lastName;
    private double seedNum;

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
