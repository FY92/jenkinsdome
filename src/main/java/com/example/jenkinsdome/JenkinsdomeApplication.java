package com.example.jenkinsdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JenkinsdomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsdomeApplication.class, args);
    }

}
