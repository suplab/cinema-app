package com.microservice.apigateway.config;

import com.microservice.apigateway.filters.ErrorFilter;
import com.microservice.apigateway.filters.PostFilter;
import com.microservice.apigateway.filters.PreFilter;
import com.microservice.apigateway.filters.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }

    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }

    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }

    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
