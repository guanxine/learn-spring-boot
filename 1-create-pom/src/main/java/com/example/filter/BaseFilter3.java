package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterConfig;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

// not support order
// https://github.com/spring-projects/spring-boot/issues/8276
//@WebFilter
public class BaseFilter3 implements Filter {

    private Logger LOG = LoggerFactory.getLogger(BaseFilter3.class);

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("Base Filter3...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
