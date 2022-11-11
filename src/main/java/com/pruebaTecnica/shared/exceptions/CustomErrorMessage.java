package com.pruebaTecnica.shared.exceptions;

import java.time.LocalDate;

public class CustomErrorMessage {

    private LocalDate timestamp; //Hora de error

    private int httpCode; //Codigo de error

    String message; //Mensaje de error

    public CustomErrorMessage(LocalDate timestamp, String message, int httpCode){

        this.timestamp = timestamp;
        this.message = message;
        this.httpCode = httpCode;
    }
}
