package com.pruebaTecnica.IMDb.infrastructure.controller;

import com.pruebaTecnica.IMDb.application.GetMovieService;
import com.pruebaTecnica.IMDb.infrastructure.controller.dto.output.MovieOutputDto;
import com.pruebaTecnica.shared.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("movies/")
public class GetMovieController {

    private final GetMovieService getMovieService;

    @GetMapping("movieId/{id}")
    public ResponseEntity<MovieOutputDto> getMovieById (@PathVariable Integer id) throws NotFoundException {

        return ResponseEntity.ok(new MovieOutputDto(getMovieService.getMovieById(id)));
    }

    @GetMapping("movieName/{name}")
    public ResponseEntity<MovieOutputDto> getMovieByName (@PathVariable String name) throws NotFoundException {

        return ResponseEntity.ok(new MovieOutputDto(getMovieService.getMovieByName(name)));
    }
}
