package pro.sky.exception;

import java.util.regex.Pattern;

public class Validator {

    public Validator() {
    }

    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("логин " + login + " не подходит по условию");
        }

        if (!PATTERN.matcher(password).matches()){
            throw new WrongPasswordException("пароль не подходит по условию");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password != confirmPassword");
        }
    }
}
