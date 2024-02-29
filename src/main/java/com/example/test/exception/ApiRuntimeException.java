package com.example.test.exception;

import lombok.Getter;

// 예외 클래스
// RuntimeException을 상속받음
@Getter
public class ApiRuntimeException extends RuntimeException {
    private ExceptionType exceptionType;
    private Exception ex;

    public ApiRuntimeException(ExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    public ApiRuntimeException(ExceptionType exceptionType, Exception ex) {
        super(ex);

        this.ex = ex;
        this.exceptionType = exceptionType;
    }
}