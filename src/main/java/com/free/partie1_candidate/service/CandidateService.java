package com.free.partie1_candidate.service;

import com.free.partie1_candidate.entities.Candidate;

public interface CandidateService {

    public Candidate saveUser(String firstname, String lastname, String age, String password, String email);

    public Candidate saveUserAll(String firstname, String lastname, String age, String password, String email, String sick, String finance, String social_stat, String self, String sociable, String hobies);
}
