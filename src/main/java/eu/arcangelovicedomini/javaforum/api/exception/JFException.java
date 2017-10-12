package eu.arcangelovicedomini.javaforum.api.exception;

public class JFException extends RuntimeException {
  private JFKeys errorKey;

  public JFException(JFKeys error) {
    super(error.getMessage());
    this.errorKey = error;
  }

  public JFException(JFKeys error, Throwable cause) {
    super(error.getMessage(), cause);
    this.errorKey = error;
  }

  public JFKeys getErrorKey() {
    return errorKey;
  }

}
