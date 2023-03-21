package org.learning.spring50errors.lesson4.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LightService {

    public void check() {
        log.info("light service check");
    }

    public void shutdown() {
        log.info("light service shutdown");
    }

//    @Service和@Bean注解在shutdown方法上不同
//    @Bean
//    public LightService lightService() {
//        return new LightService();
//    }
}
