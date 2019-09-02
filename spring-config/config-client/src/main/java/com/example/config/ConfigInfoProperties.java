package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "springcloud.book")
public class ConfigInfoProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public ConfigInfoProperties setConfig(String config) {
        this.config = config;
        return this;
    }
}
