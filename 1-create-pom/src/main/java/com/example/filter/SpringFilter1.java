package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
@Order(1)
public class SpringFilter1 implements Filter {

    private Logger LOG = LoggerFactory.getLogger(SpringFilter1.class);

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        LOG.info("SpringFilter1...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
