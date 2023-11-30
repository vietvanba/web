package com.htth.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CantSaveException.class)
    public ErrorResponse handleCantSaveException( CantSaveException e)
    {
        return new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
