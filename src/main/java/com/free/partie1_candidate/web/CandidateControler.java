package com.free.partie1_candidate.web;

import com.free.partie1_candidate.dao.CandidateReposirtory;
import com.free.partie1_candidate.entities.Candidate;
import com.free.partie1_candidate.service.CandidateService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CandidateControler {


    @Autowired
    private CandidateService candidateService;


    @PostMapping("/register")
    public Candidate register (@RequestBody UserForm userForm){
        return candidateService.saveUser(userForm.getFirstname(),userForm.getLastname(),
                userForm.getAge() ,userForm.getPassword(),userForm.getEmail());
    }




    @Data
   class UserForm {
       private String firstname ;
       private String lastname ;
       private String age ;
       private String password ;
       private String email;



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

       }
   }




