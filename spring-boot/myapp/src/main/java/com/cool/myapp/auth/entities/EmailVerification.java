package com.cool.myapp.auth.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "email_verifications")
public class EmailVerification {
    
    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    @GenericGenerator(name = "UUID_GENERATOR", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "verification_id")
    private String verificationId;
    
    @Column(name = "user_name")
    private String userName;

    public EmailVerification(String userName) {
        this.userName = userName;
    }

    public EmailVerification() {
    }

    public String getVerificationId() {
        return verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "EmailVerification [verificationId=" + verificationId + ", userName=" + userName + "]";
    }
}
