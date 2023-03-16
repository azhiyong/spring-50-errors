package org.learning.spring50errors.lesson3;

import org.learning.spring50errors.lesson3.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson03Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson03Application.class, args);
    }

    @Bean
    public User user1() {
        User user = new User();
        user.setName("li");
        user.setAge(1);
        return user;
    }
}