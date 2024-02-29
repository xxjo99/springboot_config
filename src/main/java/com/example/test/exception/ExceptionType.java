package com.example.test.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 에러코드 정의
@Getter
@AllArgsConstructor
public enum ExceptionType {
    PARAMETER_ERROR(HttpStatus.BAD_REQUEST, "C0001", "요청 파라미터 에러"),
    AUTHORITY_ERROR(HttpStatus.UNAUTHORIZED, "C0001", "권한 에러"),
    RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND, "C0001", "리소스 없음"), // NotFound
    DUPLICATE_ERROR(HttpStatus.CONFLICT, "C0001", "충돌 및 중복 에러"), // Confilct
    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "C0001", "서버 에러"); // InternalServerError

    private final HttpStatus errorStatus;
    private final String errorCode;
    private final String errorMessage;
}
