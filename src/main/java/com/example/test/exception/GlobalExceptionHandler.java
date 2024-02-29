package com.example.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.google.common.base.Throwables;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ApiRuntimeException.class)
    public ResponseEntity<ErrorResponse> ApiRuntimeExceptionhandler(ApiRuntimeException e) {
        ErrorResponse response = new ErrorResponse(e.getExceptionType().getErrorCode(),
                e.getExceptionType().getErrorMessage());

        var rootCause = Throwables.getRootCause(e);
        String stackTrace = Throwables.getStackTraceAsString(rootCause);

        log.error(stackTrace);

        return new ResponseEntity<>(response, e.getExceptionType().getErrorStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> MethodArgumentNotValidExceptionhandler(MethodArgumentNotValidException e) {
        ErrorResponse response = new ErrorResponse(ExceptionType.SERVER_ERROR.getErrorCode(),
                ExceptionType.SERVER_ERROR.getErrorMessage());

        var rootCause = Throwables.getRootCause(e);
        String stackTrace = Throwables.getStackTraceAsString(rootCause);

        log.error(stackTrace);

        return new ResponseEntity<>(response, ExceptionType.SERVER_ERROR.getErrorStatus());
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ErrorResponse> BindExceptionhandler(BindException e) {
        ErrorResponse response = new ErrorResponse(ExceptionType.SERVER_ERROR.getErrorCode(),
                ExceptionType.SERVER_ERROR.getErrorMessage());

        var rootCause = Throwables.getRootCause(e);
        String stackTrace = Throwables.getStackTraceAsString(rootCause);

        log.error(stackTrace);

        return new ResponseEntity<>(response, ExceptionType.SERVER_ERROR.getErrorStatus());
    }

}
