package com.microservices.api.movies.feign.hystrix;

import com.microservices.api.movies.feign.ReviewsFeignClient;
import com.microservices.api.movies.model.MovieReview;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ReviewsApiFallback implements ReviewsFeignClient {

    @Override
    public List<MovieReview> getMovieReviews(Long movieId) {
        return new ArrayList<>(Collections.emptyList());
    }
}
