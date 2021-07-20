package com.microservices.api.movies.service;

import com.microservices.api.movies.exception.MovieNotFoundException;
import com.microservices.api.movies.feign.ReviewsFeignClient;
import com.microservices.api.movies.model.Movie;
import com.microservices.api.movies.model.MovieReview;
import com.microservices.api.movies.repository.MoviesRespository;
import com.microservices.api.movies.rest.MovieDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    private final MoviesRespository moviesRespository;
    private final ReviewsFeignClient reviewsFeignClient;

    @Override
    public MovieDTO validateAndGetMovie(String imdb) {
        Long id = Optional.of(Long.valueOf(imdb)).orElseThrow(() -> new MovieNotFoundException(imdb));
        Movie movie = moviesRespository.findById(id).orElseThrow(() -> new MovieNotFoundException(imdb));
        List<MovieReview> movieReviews = reviewsFeignClient.getMovieReviews(id);
        return new MovieDTO(movie, movieReviews);

    }

    @Override
    public List<MovieDTO> getMovies() {
        List<Movie> movies = moviesRespository.findAll();
        List<MovieDTO> movieDtos = new ArrayList<>();
        for(Movie movie :movies){
            movieDtos.add(new MovieDTO(movie,reviewsFeignClient.getMovieReviews(movie.getImdb())));
        }
        return movieDtos;
    }

    @Override
    public Movie createMovie(Movie movie) {
        return moviesRespository.save(movie);
    }

    @Override
    public void deleteMovie(Movie movie) {
        moviesRespository.delete(movie);
    }
}
