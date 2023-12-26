package com.example.devopsquiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
        // Add your DevOps questions here
        questions.add(new Question("What does CI stand for?", new String[]{"Continuous Integration", "Continuous Deployment", "Continuous Inspection"}, 0));
        questions.add(new Question("What is the purpose of Docker?", new String[]{"Containerization", "Virtualization", "Monitoring"}, 0));
        // Add more questions as needed
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
