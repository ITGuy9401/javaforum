package eu.arcangelovicedomini.javaforum.api.exceptions;

import org.springframework.http.HttpStatus;

public enum Error {
    USER_NOT_FOUND("1001", HttpStatus.NOT_FOUND);

    private String errorCode;
    private HttpStatus httpStatus;


    Error(String errorCode, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }
}
