package org.learning.spring50errors.lesson3.controller;

import lombok.extern.slf4j.Slf4j;
import org.learning.spring50errors.lesson3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class HelloController {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("#{user1.name}")
    private String user1Name;

    @Value("#{user1}")
    private User user1;

    @Autowired
    private List<User> users;

    @GetMapping("hello")
    public String hello() {
        log.info("username:{},password:{}, user1Name:{},user1:{}, users:{}", username, password, user1Name, user1, users);
        return String.format("%s, %s, %s, %s, %s", username, password, user1Name, user1, users);
    }
}
