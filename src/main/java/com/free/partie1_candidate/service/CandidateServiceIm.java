package com.free.partie1_candidate.service;

import com.free.partie1_candidate.dao.CandidateReposirtory;
import com.free.partie1_candidate.entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CandidateServiceIm implements CandidateService {

    @Autowired
    private CandidateReposirtory candidateReposirtory;


    @Override
    public Candidate saveUser(String firstname, String lastname, String age, String password, String email) {
       Candidate candidate = new Candidate();
       candidate.setFirstname(firstname);
       candidate.setLastname(lastname);
       candidate.setAge(age);
       candidate.setPassword(password);
       candidate.setEmail(email);
        candidateReposirtory.save(candidate);

    return candidate;
    }

    @Override
    public Candidate saveUserAll(String firstname, String lastname, String age, String password, String email, String sick, String finance, String social_stat, String self, String sociable, String hobies) {
        Candidate candidate = new Candidate();
        candidate.setFirstname(firstname);
        candidate.setLastname(lastname);
        candidate.setAge(age);
        candidate.setPassword(password);
        candidate.setEmail(email);
        candidate.setSick(sick);
        candidate.setFinance(finance);
        candidate.setSocial_stat(social_stat);
        candidate.setSelf(self);
        candidate.setSociable(sociable);
        candidate.setHobies(hobies);

        candidateReposirtory.save(candidate);

        return candidate;
    }
}
