package com.microservices.api.movies.feign;

import com.microservices.api.movies.feign.hystrix.ReviewsApiFallbackFactory;
import com.microservices.api.movies.model.MovieReview;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="reviews-api", fallbackFactory = ReviewsApiFallbackFactory.class)
public interface ReviewsFeignClient {

    @GetMapping("/reviews/{movieID}")
    List<MovieReview> getMovieReviews(@PathVariable("movieID") Long movieId);
}
