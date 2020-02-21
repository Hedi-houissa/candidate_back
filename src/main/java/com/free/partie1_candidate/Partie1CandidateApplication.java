package com.free.partie1_candidate;

import com.free.partie1_candidate.service.CandidateService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Partie1CandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Partie1CandidateApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CandidateService accountService) {
        return Args -> {
            accountService.saveUserAll("test", "test", "145", "ppp", "hhhh@jjjj", "no sick cronique", "good finance sta", "good social stat", "self runing", "good sociable stat", "like game");
            accountService.saveUserAll("test1", "test1", "15", "aaa", "hhhh@jjjj", "sick cronique", "bad finance sta", "bad social stat", "self runing", "good sociable stat", "like game");
            accountService.saveUser("test2", "test2", "17", "aana", "hhhh@jjjj");
        };
    }
}
