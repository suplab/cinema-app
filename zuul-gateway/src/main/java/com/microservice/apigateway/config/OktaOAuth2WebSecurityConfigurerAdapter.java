package com.microservice.apigateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class OktaOAuth2WebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/actuator/*").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .and()
                .oauth2ResourceServer().jwt();
    }
}
