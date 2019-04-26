package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication　// same as @Configuration @EnableAutoConfiguration @ComponentScan

/*

@Configuration
@EnableAutoConfiguration
@Import({ MyConfig.class, MyAnotherConfig.class })

 */
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello, World";
    }
    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}