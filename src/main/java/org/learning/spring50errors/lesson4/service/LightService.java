package org.learning.spring50errors.lesson4.service;

import org.springframework.stereotype.Service;

@Service
public class LightService {

    public void check() {
        System.out.println("light service check");
    }

    public void shutdown() {
        System.out.println("light service shutdown");
    }
}
