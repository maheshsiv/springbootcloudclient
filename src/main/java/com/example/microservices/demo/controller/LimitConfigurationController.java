package com.example.microservices.demo.controller;

import com.example.microservices.demo.configuration.DataConfiguration;
import com.example.microservices.demo.configuration.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    DataConfiguration dataConfiguration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsfromConiguration(){

        return new LimitConfiguration(dataConfiguration.getMaximum(),dataConfiguration.getMinimum());

    }
}
