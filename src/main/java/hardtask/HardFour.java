package hardtask;

import java.util.Scanner;

public class HardFour {
    public static void main(String[] args) {
        //Проверка логина и пароля: Напишите программу, которая запрашивает у пользователя логин и пароль и проверяет их.
        // Пользователь будет авторизован, если логин равен "admin" и пароль равен "password".
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = sc.next();
        if (login == "admin") {
            System.out.println("Введите пароль: ");
        } else {
            System.out.println("Логин не верный");
        }
        String pas = sc.next();
        if (pas == "password") {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();


    }
}
