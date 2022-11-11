package com.pruebaTecnica.shared.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class ExceptionsHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public final CustomErrorMessage handlerNotFound (NotFoundException ex){


        return new CustomErrorMessage(LocalDate.now(), ex.getMessage(), HttpStatus.NOT_FOUND.value());
    }
}
