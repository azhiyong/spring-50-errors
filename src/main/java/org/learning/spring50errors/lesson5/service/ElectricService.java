package org.learning.spring50errors.lesson5.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-20
 */
@Slf4j
@Service
public class ElectricService {
    
    @Autowired
    private UserService userService;

    public void charge() throws InterruptedException {
        log.info("electric service charge");
        this.pay();
    }

    public void pay() throws InterruptedException {
        userService.login();
        String payNum = userService.getUser().getPayNum();
        log.info("electric service pay, payNum:{}", payNum);
        Thread.sleep(1000);
    }
}
