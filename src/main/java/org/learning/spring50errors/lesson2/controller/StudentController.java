package org.learning.spring50errors.lesson2.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {

    @Resource
    @Qualifier("studentController.InnerClassDataService")
    private InnerClassDataService innerClassDataService;

    @GetMapping("hi")
    public String hi() {
        return "hi, " + innerClassDataService;
    }

    @Repository
    public static class InnerClassDataService {
        public void deleteStudent(int id) {
        }
    }
}
