package com.free.partie1_candidate;

import com.free.partie1_candidate.dao.CandidateReposirtory;
import com.free.partie1_candidate.entities.Candidate;
import com.free.partie1_candidate.service.CandidateService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@WebMvcTest
class Partie1CandidateApplicationTests {
    @Autowired
    MockMvc mockMvc;
    @MockBean
    CandidateService candidateService;

    Candidate mockCandidate = new Candidate("test2", "test2", "17", "aana", "hhhh@jjjj");

    @Test
    void contextLoads() throws Exception {

        when(candidateService.saveUser(Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString(),Mockito.anyString()))
                .thenReturn(mockCandidate );
        MvcResult mvcResult =mockMvc.perform(
                MockMvcRequestBuilders.post("/register")
                .accept(MediaType.APPLICATION_JSON)
        ).andReturn();

        verify(candidateService).saveUser("test2", "test2", "17", "aana", "hhhh@jjjj");


    }

}
