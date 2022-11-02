package com.kgisl.springbootyml.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private Date dob;
    private String gender;
    private String qualification;
    private boolean language;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public boolean isLanguage() {
        return language;
    }
    public void setLanguage(boolean language) {
        this.language = language;
    }
    // public Student() {
    // }
    // @Override
    // public String toString() {
    //     return "Student [dob=" + dob + ", email=" + email + ", firstname=" + firstname + ", gender=" + gender + ", id="
    //             + id + ", language=" + language + ", lastname=" + lastname + ", qualification=" + qualification + "]";
    // }

   
}
