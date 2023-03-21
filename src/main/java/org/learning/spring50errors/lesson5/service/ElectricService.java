package org.learning.spring50errors.lesson5.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lizhiyong <lizhiyong@kuaishou.com>
 * Created on 2023-03-20
 */
@Slf4j
@Service
public class ElectricService {

    public void charge() throws InterruptedException {
        log.info("electric service charge");
        this.pay();
    }

    public void pay() throws InterruptedException {
        log.info("electric service pay");
        Thread.sleep(1000);
    }
}
