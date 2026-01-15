package org.example.echo.global.exception;

import lombok.Data;

@Data
public class ErrorResponseEntity {
    private ErrorCode errorCode;
    private String message;

    public ErrorResponseEntity(ErrorCode e) {
        this.errorCode = e;
        this.message = e.getMessage();
    }
}
