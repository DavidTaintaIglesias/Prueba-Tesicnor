package com.pruebaTecnica.IMDb.application.impl;

import com.pruebaTecnica.IMDb.application.GetMovieService;
import com.pruebaTecnica.IMDb.domain.entity.Movie;
import com.pruebaTecnica.IMDb.infrastructure.repository.MovieRepository;
import com.pruebaTecnica.shared.exceptions.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetMovieServiceImpl  implements GetMovieService {

    private final MovieRepository repo;

    @Override
    public Movie getMovieById(Integer id) throws NotFoundException {

        return repo.findById(id).orElseThrow(()-> new NotFoundException("Not found movie whit id "+ id));
    }

    @Override
    public Movie getMovieByName(String name) throws NotFoundException{

        return repo.findByName(name).orElseThrow(()-> new NotFoundException("Not found movie whit name "+ name));
    }
}
