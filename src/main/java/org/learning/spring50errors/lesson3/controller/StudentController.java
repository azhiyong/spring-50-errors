package org.learning.spring50errors.lesson3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("#{user1.name}")
    private String user1Name;

    @GetMapping("hi")
    public String hi() {
        return String.format("%s, %s, %s", username, password, user1Name);
    }
}
