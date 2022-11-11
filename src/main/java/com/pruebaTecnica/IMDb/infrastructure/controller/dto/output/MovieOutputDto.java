package com.pruebaTecnica.IMDb.infrastructure.controller.dto.output;

import com.pruebaTecnica.IMDb.domain.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieOutputDto {

    private Integer id;
    private String name;
    private Integer year;
    private Float valoration;

    /*
     Otra opción sería implementar mapstruct en el proyecto
    para no necesitar estos constructores
     */
    public MovieOutputDto (Movie movie){

        setId(movie.getId());
        setName(movie.getName());
        setYear(movie.getYear());
        setValoration(movie.getValoration());
    }
}
