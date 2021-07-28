package com.microservices.api.reviews.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@Document(collation = "movieReview")
public class MovieReview {

    @Id
    private Long reviewId;
    private Long movieId;
    private String review;
    private String authorName;
}
