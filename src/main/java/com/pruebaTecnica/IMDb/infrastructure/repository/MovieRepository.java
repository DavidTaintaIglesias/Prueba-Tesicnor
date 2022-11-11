package com.pruebaTecnica.IMDb.infrastructure.repository;

import com.pruebaTecnica.IMDb.domain.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Optional<Movie> findByName(String name);
}
