package com.example.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class ServletConfig {

    @Bean
    ServletRegistrationBean htmlServlet() {
        ServletRegistrationBean srb = new ServletRegistrationBean();
        srb.setServlet(new HtmlServlet());
        srb.setUrlMappings(Arrays.asList("/html"));
        return srb;
    }

}
