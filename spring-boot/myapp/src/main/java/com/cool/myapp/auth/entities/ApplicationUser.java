package com.cool.myapp.auth.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application_users")
public class ApplicationUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "verified")
    private boolean verified;
    @Column(name = "locked")
    private boolean locked;
    @Column(name = "acc_cred_expired")
    private boolean accountCredentialExpired;

    public ApplicationUser() {
        
    }
    
    public ApplicationUser(String firstName, String lastName, String userName, String email, String password,
            boolean verified, boolean locked, boolean accountCredentialExpired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.verified = verified;
        this.locked = locked;
        this.accountCredentialExpired = accountCredentialExpired;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isAccountCredentialExpired() {
        return accountCredentialExpired;
    }

    public void setAccountCredentialExpired(boolean accountCredentialExpired) {
        this.accountCredentialExpired = accountCredentialExpired;
    }

    @Override
    public String toString() {
        return "ApplicationUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
                + userName + ", email=" + email + ", password=" + password + ", verified=" + verified + ", locked="
                + locked + ", accountCredentialExpired=" + accountCredentialExpired + "]";
    }
}
