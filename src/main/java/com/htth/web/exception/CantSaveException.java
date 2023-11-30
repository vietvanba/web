package com.htth.web.exception;

public class CantSaveException extends RuntimeException {
    public CantSaveException(String err) {
        super(err);
    }
}
