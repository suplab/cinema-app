package com.microservices.api.movies.repository;

import com.microservices.api.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRespository extends JpaRepository<Movie, Long> {
}
