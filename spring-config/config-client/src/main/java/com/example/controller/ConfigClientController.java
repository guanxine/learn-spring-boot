package com.example.controller;

import com.example.config.ConfigInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

    @Autowired
    private ConfigInfoProperties configInfoProperties;

    @Value("${demo}")
    private String demo;

    @RequestMapping("/config")
    public String getConfigInfo() {
        System.out.println("demo:" + demo);
        return configInfoProperties.getConfig();
    }
}
