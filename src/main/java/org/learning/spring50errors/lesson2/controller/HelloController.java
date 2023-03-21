package org.learning.spring50errors.lesson2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    @Qualifier("helloController.InnerClassService")
    private InnerClassService innerClassService;

    @GetMapping("hello")
    public String hello() {
        return "hello, " + innerClassService;
    }

    @Repository
    public static class InnerClassService {
        public void justRun() {
        }
    }
}
