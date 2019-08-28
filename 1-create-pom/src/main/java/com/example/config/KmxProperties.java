package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@ConfigurationProperties("kmx")
@Component
@Validated
public class KmxProperties {
    @NotNull
    private String k1;
    private String k2;


    public String getK1() {
        return k1;
    }

    public KmxProperties setK1(String k1) {
        this.k1 = k1;
        return this;
    }

    public String getK2() {
        return k2;
    }

    public KmxProperties setK2(String k2) {
        this.k2 = k2;
        return this;
    }
}
