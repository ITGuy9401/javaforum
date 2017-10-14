package eu.arcangelovicedomini.javaforum.api.exception;

public class JFException extends RuntimeException {
    private final JFKeys error;

  public JFException(JFKeys error) {
    super(error.getMessage());
      this.error = error;
  }

  public JFException(JFKeys error, Throwable cause) {
    super(error.getMessage(), cause);
      this.error = error;
  }

    public JFKeys getError() {
        return error;
  }

}
