package by.htp.les22.service.impl;

import by.htp.les22.service.UserService;

public class UserServiceImpl implements UserService {

    private boolean characters(String input) throws ValidateException {
        if (input.length() < 8 || input == null || input.length() >=20) {
            throw new ValidateException("Login length is less than 8 or more than 20");
        }
        return true;
    }

    private boolean isUpperLowerCase(String input) throws ValidateException {
        boolean upperCheck = false;
        boolean lowerCheck = false;
        for (char c : input.toCharArray()) {

            if (Character.isUpperCase(c))
            {
                upperCheck = true;
            }

            if (Character.isLowerCase(c))
            {
                lowerCheck = true;
            }

        }

        if (!upperCheck) {
            throw new ValidateException("There must be an uppercase character");
        }

        if (!lowerCheck) {
            throw new ValidateException("There must be a lowercase character");
        }

        return true;
    }

    @Override
    public boolean logination(String login, String password) throws ValidateException {

        this.characters(login);
        this.characters(password);
        this.isUpperLowerCase(login);
        this.isUpperLowerCase(password);

        return true;
    }
}

