package com.microservices.api.movies.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieReview {
    private Long Id;
    private Long movieId;
    private String review;
    private String authorName;
}
