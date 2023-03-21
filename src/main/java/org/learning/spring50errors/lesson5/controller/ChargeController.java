package org.learning.spring50errors.lesson5.controller;

import org.learning.spring50errors.lesson5.service.ElectricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargeController {

    @Autowired
    private ElectricService electricService;

    @GetMapping("charge")
    public void charge() throws InterruptedException {
        electricService.charge();
    }
}
