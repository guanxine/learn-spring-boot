package com.example.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class FilterConfig {
    private Logger LOG = LoggerFactory.getLogger(FilterConfig.class);

    public FilterConfig() {
        LOG.debug("Init filter config..");
    }


    @Bean
    public FilterRegistrationBean springFilter2() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new SpringFilter2());
        registration.setOrder(2);
        registration.setUrlPatterns(Arrays.asList("/*"));
        return registration;
    }

    @Bean
    public FilterRegistrationBean baseFilter3() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new BaseFilter3());
        registration.setOrder(3);
        registration.setUrlPatterns(Arrays.asList("/*"));
        return registration;
    }
}
