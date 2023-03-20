package org.learning.spring50errors.lesson4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LightMgrService {

    private LightService lightService;

//    java.lang.NullPointerException
//    public LightMgrService() {
//        lightService.check();
//    }

    public LightMgrService(LightService lightService) {
        this.lightService = lightService;
        lightService.check();
    }
}
