package org.learning.spring50errors.lesson1.controller;

import org.learning.spring50errors.lesson1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-02-07
 */
@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("hello")
    public String hello() {
        return "Hello, " + userService + "; " + getUserService1() + "; " + getUserService2();
    }

    @Lookup
    public UserService getUserService1() {
        return null;
    }

    public UserService getUserService2() {
        return applicationContext.getBean(UserService.class);
    }
}
