package com.microservices.api.movies.rest;

import com.microservices.api.movies.model.Genre;
import com.microservices.api.movies.model.Movie;
import com.microservices.api.movies.model.MovieReview;
import lombok.Data;

import java.util.List;

@Data
public class MovieDTO {
    private Long imdb;
    private String title;
    private String year;
    private Genre genre;
    private String country;
    private List<MovieReview> reviews;

    public MovieDTO(Movie movie, List<MovieReview> reviews) {
        this.imdb = movie.getImdb();
        this.title = movie.getTitle();
        this.year = movie.getYear();
        this.genre = movie.getGenre();
        this.country = movie.getCountry();
        this.reviews = reviews;
    }

}
