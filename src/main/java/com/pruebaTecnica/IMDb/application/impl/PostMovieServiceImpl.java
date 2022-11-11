package com.pruebaTecnica.IMDb.application.impl;

import com.pruebaTecnica.IMDb.application.PostMovieService;
import com.pruebaTecnica.IMDb.domain.entity.Movie;
import com.pruebaTecnica.IMDb.infrastructure.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PostMovieServiceImpl implements PostMovieService {

    private final MovieRepository repo;

    @Override
    public Movie postMovie(Movie movie) {

        return repo.save(movie);
    }
}
