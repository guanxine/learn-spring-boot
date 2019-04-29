package com.example.listener;

import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;

public class ListenerConfig {

    @Bean
    ServletListenerRegistrationBean<ServletContextListener> myServletListener () {
        ServletListenerRegistrationBean<ServletContextListener> srb =
                new ServletListenerRegistrationBean();
        srb.setListener(new ServletListener());
        return srb;
    }
}
