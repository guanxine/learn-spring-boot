package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

public class SpringFilter2 implements Filter {

    private Logger LOG = LoggerFactory.getLogger(SpringFilter2.class);

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("SpringFilter2...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
