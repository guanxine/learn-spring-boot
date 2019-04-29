package com.example;

import com.example.filter.FilterConfig;
import com.example.listener.ListenerConfig;
import com.example.servlet.ServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
@ServletComponentScan
@Import({FilterConfig.class, ServletConfig.class, ListenerConfig.class})

/*

@Configuration
@EnableAutoConfiguration
@Import({ MyConfig.class, MyAnotherConfig.class })

 */
public class Example {
    @RequestMapping("/")
    String home() {
        return "Hello, World~";
    }

    @RequestMapping("/hot")
    String hotSwapping() {

        return "Hello, World. Hot Swaping";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}