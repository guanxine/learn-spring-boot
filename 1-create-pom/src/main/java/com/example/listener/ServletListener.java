package com.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener {

    private Logger LOG = LoggerFactory.getLogger(ServletListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        LOG.debug("ServletListener init...");
    }



    public void contextDestroyed(ServletContextEvent sce) {
        LOG.debug("ServletListener destroy...");
    }
}
