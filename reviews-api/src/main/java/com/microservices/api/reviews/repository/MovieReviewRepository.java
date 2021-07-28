package com.microservices.api.reviews.repository;

import com.microservices.api.reviews.model.MovieReview;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieReviewRepository extends MongoRepository  <MovieReview, Long> {

    List<MovieReview> findAllByMovieId(Long MovieId);
}
