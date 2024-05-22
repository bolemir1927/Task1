package hardtask;

import java.util.Scanner;

public class HardFour {
    public static void main(String[] args) {
        //Проверка логина и пароля: Напишите программу, которая запрашивает у пользователя логин и пароль и проверяет их.
        // Пользователь будет авторизован, если логин равен "admin" и пароль равен "password".
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите логин: ");
        String login = sc.next();

        System.out.println("Введите пароль:");
        String pas = sc.next();

        if (login.equals("admin") && pas.equals("password")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
