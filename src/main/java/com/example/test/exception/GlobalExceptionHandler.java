package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiRuntimeException.class)
    public ResponseEntity<ErrorResponse> handler(ApiRuntimeException e) {
        ErrorResponse response = new ErrorResponse(e.getExceptionType().getErrorCode(),
                e.getExceptionType().getErrorMessage());

        return new ResponseEntity<>(response, e.getExceptionType().getErrorStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handler(Exception e) {

        e.printStackTrace();

        // trace to String

        ErrorResponse response = new ErrorResponse("C0001", e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
