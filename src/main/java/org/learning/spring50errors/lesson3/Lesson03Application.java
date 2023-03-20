package org.learning.spring50errors.lesson3;

import org.learning.spring50errors.lesson3.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Lesson03Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson03Application.class, args);
    }

    @Bean
    public User user1() {
        return newUser("lisi", 12);
    }

    @Bean
    public List<User> userList() {
        return Arrays.asList(newUser("zhangsan", 30),
                newUser("wangwu", 23));
    }

    private User newUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
}