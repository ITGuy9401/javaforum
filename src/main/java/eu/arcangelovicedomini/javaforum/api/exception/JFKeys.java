package eu.arcangelovicedomini.javaforum.api.exception;

import org.springframework.http.HttpStatus;

public enum JFKeys {
  UNKNOWN_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "JF-0001", "An unknown error has been thrown"),

  USER_CREATE_UUID_PRESENT(HttpStatus.BAD_REQUEST, "JF-1001", "The CREATE operation will automatically generate an identifier, it cannot be present"),
  USER_MODIFY_UUID_NOT_PRESENT(HttpStatus.BAD_REQUEST, "JF-1002", "The MODIFY operation an identifier, it cannot be absent from the request");

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

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
