package com.tamjid.microservices.limitsservice.controller;

import com.tamjid.microservices.limitsservice.beans.Limits;
import com.tamjid.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(configuration.getMin(), configuration.getMax());
    }
}
