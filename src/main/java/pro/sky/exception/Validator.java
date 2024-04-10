package pro.sky.exception;

import java.util.Arrays;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern PATTERN = Pattern.compile("\\w{1,20}");

    public Validator() {
    }

    public static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (!PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("логин " + login + " не подходит по условию, т.к стоит не допустимый символ.");
        }

        if (!PATTERN.matcher(password).matches()) {
            throw new WrongPasswordException("пароль " + password + " не подходит по условию, не корректно введены данные.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароль " + password +"  не равен , + != confirmPassword + ");
        }


//        String[] result = "java_skypro_go94673".split("\\.");
//        System.out.println(result[20]);
//        System.out.println(Arrays.toString(result));
    }
}
