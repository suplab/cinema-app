package com.microservices.api.reviews.rest;

import com.microservices.api.reviews.model.MovieReview;
import com.microservices.api.reviews.repository.MovieReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static net.logstash.logback.argument.StructuredArguments.v;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/reviews")
public class ReviewsRestController {

    private final MovieReviewRepository movieReviewRepository;

    @GetMapping
    public ResponseEntity<List<MovieReview>> getAllReviews() {
        List<MovieReview> reviews = movieReviewRepository.findAll();
        log.info("Get all reviews", v("numReviewsReturned", reviews.size()));
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/{movieID}")
    public ResponseEntity<List<MovieReview>> getMovieReviews(@PathVariable("movieID") Long movieID) {
        log.info("Get reviews for movie", v("movieID", movieID));
        return ResponseEntity.ok(movieReviewRepository.findAllByMovieId(movieID));
    }
}
