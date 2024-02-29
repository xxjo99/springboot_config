package com.example.test.exception;

import lombok.Getter;

// 에러 응답 클래스
@Getter
public class ErrorResponse {
    private String code;
    private String msg;

    public ErrorResponse(String errorCode, String errorMessage) {
        this.code = errorCode;
        this.msg = errorMessage;
    }
}
