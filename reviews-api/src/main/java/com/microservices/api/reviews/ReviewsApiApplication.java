package com.microservices.api.reviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ReviewsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewsApiApplication.class, args);
    }
}
