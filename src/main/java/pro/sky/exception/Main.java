package pro.sky.exception;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try {
             Validator.check("java_skypro_go94673$", "java_skypro_go94673", "java_skypro_go946734");
            //(не допустимый символ):
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("не верные входные данные:" + exception.getMessage());
        }

            //validator.check("java_skypro_go94673", "java_skypro_go94673", "java_skypro_go946734");
            //validator.check("java_skypro_go94673", "java_skypro_go94673", "java_skypro_go946734");

        try {
             Validator.check("java_skypro_go94673", "java_skypro_go94673%", "java_skypro_go946734");
             //(не корректно введены данные):

        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("не верные входные данные:" + exception.getMessage());
        }

    }
}
