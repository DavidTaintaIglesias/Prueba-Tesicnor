package com.pruebaTecnica.IMDb.infrastructure.controller;

import com.pruebaTecnica.IMDb.application.PostMovieService;
import com.pruebaTecnica.IMDb.domain.entity.Movie;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("postMovies")
public class PostMovieController {

    private final PostMovieService postMovieService;

    @PostMapping
    public ResponseEntity<Movie> postMovies (@RequestParam String name){

        String uri = "http://www.omdbapi.com/?apikey=731e41f&t="+name;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> result = restTemplate.getForObject(uri, Map.class);
        Movie movie = new Movie();
        movie.setName(result.get("Title"));
        movie.setYear(result.get("Year"));
        movie.setValoration(Math.random()*10);
        postMovieService.postMovie(movie);
        return ResponseEntity.ok(movie);
    }
}
