package com.microservices.api.movies.feign.hystrix;

import com.microservices.api.movies.feign.ReviewsFeignClient;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
@Slf4j
public class ReviewsApiFallbackFactory implements FallbackFactory<ReviewsFeignClient> {

    @Override
    public ReviewsFeignClient create(Throwable throwable) {
        return movieId -> {
            log.error("Error occurred trying to fetch reviews from review service", throwable);
            return new ArrayList<>(Collections.emptyList());
        };
    }
}
