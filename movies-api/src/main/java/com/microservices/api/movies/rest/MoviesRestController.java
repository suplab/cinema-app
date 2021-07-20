package com.microservices.api.movies.rest;

import com.microservices.api.movies.model.Movie;
import com.microservices.api.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static net.logstash.logback.argument.StructuredArguments.v;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MoviesRestController {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<MovieDTO>> getMovies() {
        List<MovieDTO> movies = movieService.getMovies();
        log.info("Get all movies", v("numMoviesReturned", movies.size()));
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{imdb}")
    public ResponseEntity<MovieDTO> getMovie(@PathVariable("imdb") String imdb) {
        log.info("Get movie", v("imdb", imdb));
        return ResponseEntity.ok(movieService.validateAndGetMovie(imdb));
    }


}
