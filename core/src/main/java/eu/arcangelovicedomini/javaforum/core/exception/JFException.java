package eu.arcangelovicedomini.javaforum.core.exception;

public class JFException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	public Object[] getMessageArgs() {
		return messageArgs;
	}

	public void setMessageArgs(Object[] messageArgs) {
		this.messageArgs = messageArgs;
	}

	public ExceptionType getExceptionType() {
		return exceptionType;
	}

	public void setExceptionType(ExceptionType exceptionType) {
		this.exceptionType = exceptionType;
	}
}
