package com.free.partie1_candidate.dao;

import com.free.partie1_candidate.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CandidateReposirtory extends JpaRepository<Candidate,Long> {
}
