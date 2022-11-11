package com.pruebaTecnica.IMDb.application;

import com.pruebaTecnica.IMDb.domain.entity.Movie;
import com.pruebaTecnica.shared.exceptions.NotFoundException;

public interface GetMovieService {

    Movie getMovieById (Integer id) throws NotFoundException;

    Movie getMovieByName (String name) throws NotFoundException;
}
