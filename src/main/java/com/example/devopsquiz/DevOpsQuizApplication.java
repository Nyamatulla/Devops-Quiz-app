package com.example.devopsquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsQuizApplication {

    public static void main(String[] args) {
        // Specify the port here
        System.setProperty("server.port", "8081");

        SpringApplication.run(DevOpsQuizApplication.class, args);
    }
}
