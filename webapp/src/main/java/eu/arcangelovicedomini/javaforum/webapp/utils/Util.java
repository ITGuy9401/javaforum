package eu.arcangelovicedomini.javaforum.webapp.utils;

import eu.arcangelovicedomini.javaforum.core.exception.JFException;
import eu.arcangelovicedomini.javaforum.core.exception.JFException.ExceptionType;

public class Util {

	public static JFException resolveException(Throwable th) {
		if (th instanceof JFException) {
			return (JFException) th;
		}
		return new JFException(ExceptionType.TECHNICAL, "Generic Error in JavaForum: " + th.getMessage(), "error.JavaForum.genericException", th.getMessage());
	}
}
