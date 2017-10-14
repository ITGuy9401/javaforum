package eu.arcangelovicedomini.javaforum.api.utils;

import org.apache.commons.validator.routines.EmailValidator;

public class ValidationUtils {

    public static boolean isEmailValid(String email) {
        EmailValidator emailValidator = EmailValidator.getInstance(false, true);
        return emailValidator.isValid(email);
    }
}
