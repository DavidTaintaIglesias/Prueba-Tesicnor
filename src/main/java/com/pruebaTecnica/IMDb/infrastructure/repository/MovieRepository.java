package com.pruebaTecnica.IMDb.infrastructure.repository;

import com.pruebaTecnica.IMDb.domain.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
