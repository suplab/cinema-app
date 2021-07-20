package com.microservices.api.movies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {

    @Id
    @GeneratedValue
    private Long imdb;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String year;

    @Column(nullable = false)
    private Genre genre;

    @Column(nullable = false)
    private String country;
}