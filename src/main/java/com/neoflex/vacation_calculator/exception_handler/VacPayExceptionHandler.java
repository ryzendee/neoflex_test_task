package com.neoflex.vacation_calculator.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class VacPayExceptionHandler{

    @ExceptionHandler
    public ResponseEntity<VacPayErrorData> handlerException(IllegalArgumentException exception) {
        VacPayErrorData data = new VacPayErrorData();
        data.setMessage(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<VacPayErrorData> handlerException(Exception exception) {
        VacPayErrorData data = new VacPayErrorData();
        data.setMessage(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
