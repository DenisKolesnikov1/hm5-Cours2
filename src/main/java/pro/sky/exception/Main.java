package pro.sky.exception;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            Validator.check("java_skypro_go94673$", "java_skypro_go94673", "java_skypro_go946734");
            Validator.check("java_skypro_go94673", "java_skypro_go94673", "java_skypro_go946734");
            Validator.check("java_skypro_go94673", "java_skypro_go94673", "java_skypro_go946734");
            Validator.check("java_skypro_go94673", "java_skypro_go94673", "java_skypro_go946734");

        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("не верные входные данные:" + exception.getMessage());
        }

    }
}
