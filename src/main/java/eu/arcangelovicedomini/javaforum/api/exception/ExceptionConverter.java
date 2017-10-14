package eu.arcangelovicedomini.javaforum.api.exception;

public class ExceptionConverter {

    public static JFException convert(Throwable th) {
        if (th instanceof JFException) return (JFException) th;
        return new JFException(JFKeys.UNKNOWN_ERROR, th);
    }
}
