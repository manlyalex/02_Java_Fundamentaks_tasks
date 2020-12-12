package by.htp.les22.service.impl;

public class ValidateException extends Exception {

    public ValidateException() {
        super("Invalid login or password");
    }

    public ValidateException(String message) {
        super("Invalid login or password: " + message);
    }


}
