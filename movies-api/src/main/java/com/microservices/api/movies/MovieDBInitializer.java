package com.microservices.api.movies;

import com.microservices.api.movies.model.Genre;
import com.microservices.api.movies.model.Movie;
import com.microservices.api.movies.repository.MoviesRespository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MovieDBInitializer {

    @Bean
    ApplicationRunner initReviews(MoviesRespository movieRepository) {
        return args -> {
            Movie lordOfTheRings = new Movie(1L,"The Lord Of The Rings: The Return of the King","2003", Genre.Fantasy, "US");
            movieRepository.save(lordOfTheRings);

            Movie theLastSamurai = new Movie(2L,"The Last Samurai", "2003",Genre.Action,"US");
            movieRepository.save(theLastSamurai);

            movieRepository.findAll().forEach(System.out::println);
        };
    }
}
