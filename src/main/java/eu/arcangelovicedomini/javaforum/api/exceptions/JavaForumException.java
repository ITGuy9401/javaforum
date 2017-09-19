package eu.arcangelovicedomini.javaforum.api.exceptions;

public class JavaForumException extends RuntimeException {
    private Error error;

    public JavaForumException(Error error) {
        super(error.name());
        this.error = error;
    }

    public JavaForumException(Error error, Throwable cause) {
        super(error.name(), cause);
        this.error = error;
    }

    public Error getError() {
        return error;
    }
}
