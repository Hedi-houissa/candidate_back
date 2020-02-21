package com.free.partie1_candidate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String firstname ;
    private String lastname ;
    private String age;
    private String password ;
    private String email;
    private String sick;
    private String finance;
    private String social_stat;
    private String self;
    private String sociable;
    private String hobies;


    public Candidate(String firstname, String lastname, String age, String password, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.email = email;
    }
    public Candidate(String firstname, String lastname, String age, String password, String email, String sick, String finance, String social_stat, String self, String sociable, String hobies) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.password = password;
        this.email = email;
        this.sick = sick;
        this.finance = finance;
        this.social_stat = social_stat;
        this.self = self;
        this.sociable = sociable;
        this.hobies = hobies;
    }


    public Candidate() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSick() {
        return sick;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public String getFinance() {
        return finance;
    }

    public void setFinance(String finance) {
        this.finance = finance;
    }

    public String getSocial_stat() {
        return social_stat;
    }

    public void setSocial_stat(String social_stat) {
        this.social_stat = social_stat;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getSociable() {
        return sociable;
    }

    public void setSociable(String sociable) {
        this.sociable = sociable;
    }

    public String getHobies() {
        return hobies;
    }

    public void setHobies(String hobies) {
        this.hobies = hobies;
    }
}
