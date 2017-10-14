package eu.arcangelovicedomini.javaforum.api.exception;

import org.springframework.http.HttpStatus;

public enum JFKeys {
    UNKNOWN_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "JF-0001", "An unknown error has been thrown"),

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "JF-1001", "User not found"),
    USER_CREATE_UUID_PRESENT(HttpStatus.BAD_REQUEST, "JF-1002", "The CREATE operation will automatically generate an identifier, it cannot be present"),
    USER_MODIFY_UUID_NOT_PRESENT(HttpStatus.BAD_REQUEST, "JF-1003", "The MODIFY operation an identifier, it cannot be absent from the request"),
    USER_EMAIL_NOT_VALID(HttpStatus.BAD_REQUEST, "JF-1004", "The EMAIL is not valid"),
    USER_EMAIL_ALREADY_USED(HttpStatus.CONFLICT, "JF-1005", "The EMAIL is already used by another user");

    private HttpStatus status;
    private String errorCode;
    private String message;

    JFKeys(HttpStatus status, String errorCode, String message) {
        this.status = status;
        this.errorCode = errorCode;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }
}
