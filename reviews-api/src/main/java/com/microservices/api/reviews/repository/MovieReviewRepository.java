package com.microservices.api.reviews.repository;

import com.microservices.api.reviews.model.MovieReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieReviewRepository extends JpaRepository<MovieReview, Long> {

    List<MovieReview> findAllByMovieId(Long MovieId);
}
