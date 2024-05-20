package hardtask;

import java.util.Scanner;

public class HardFour {
    public static void main(String[] args) {
        //Проверка логина и пароля: Напишите программу, которая запрашивает у пользователя логин и пароль и проверяет их.
        // Пользователь будет авторизован, если логин равен "admin" и пароль равен "password".
        String login = "admin";
        String pas = "password";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String admin = sc.next();
        if (login.equals(admin)) {
            System.out.println("Введите пароль: ");
        } else {
            System.out.println("Логин не верный");
        }
        String password = sc.next();
        if (pas.equals(password)) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();


    }
}
