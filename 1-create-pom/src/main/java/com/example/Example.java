package com.example;

import com.example.config.KmxProperties;
import com.example.filter.FilterConfig;
import com.example.listener.ListenerConfig;
import com.example.servlet.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
//@EnableConfigurationProperties(KmxProperties.class)
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
    @RequestMapping("/sip")
    Map<String, String> sip(HttpServletRequest request) {
        Map<String, String> result = new HashMap<String, String>();
        result.put("x-forwarded-for", request.getHeader("x-forwarded-for"));
        result.put("X-Real-IP", request.getHeader("X-Real-IP"));
        result.put("getRemoteAddr", request.getRemoteAddr());
        return result;
    }

    @RequestMapping("/hot")
    String hotSwapping() {

        return "Hello, World. Hot Swaping";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}