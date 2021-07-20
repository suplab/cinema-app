package com.microservices.api.movies.service;

import com.microservices.api.movies.model.Movie;
import com.microservices.api.movies.rest.MovieDTO;

import java.util.List;

public interface MovieService {
    MovieDTO validateAndGetMovie(String imdb);

    List<MovieDTO> getMovies();

    Movie createMovie(Movie movie);

    void deleteMovie(Movie movie);
}
