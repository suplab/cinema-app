package com.microservices.api.reviews.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class MovieReview {

    @Id
    @GeneratedValue
    private Long reviewId;
    private Long movieId;
    private String review;
    private String authorName;
}
