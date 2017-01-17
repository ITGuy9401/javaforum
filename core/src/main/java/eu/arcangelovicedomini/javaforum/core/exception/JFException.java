package eu.arcangelovicedomini.javaforum.core.exception;

public class JFException extends Exception {
	public static enum ExceptionType {
		TECHNICAL, BUSINESS
	}
	private String message;
	private String messageKey;
	private Object[] messageArgs;
	private ExceptionType exceptionType;
	
	public JFException(ExceptionType exceptionType, String message, String messageKey, Object... messageArgs) {
		this.message = message;
		this.messageKey = messageKey;
		this.messageArgs = messageArgs;
		this.exceptionType = exceptionType;
	}
}
