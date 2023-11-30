package com.htth.web.exception;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorResponse {
    private final HttpStatus httpStatus;
    private final String error;
}