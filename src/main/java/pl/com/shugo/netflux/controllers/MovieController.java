package pl.com.shugo.netflux.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.shugo.netflux.domain.Movie;
import pl.com.shugo.netflux.services.MovieService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/{id}")
    Mono<Movie> getMoviesById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }

    @GetMapping()
    Flux<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

}
