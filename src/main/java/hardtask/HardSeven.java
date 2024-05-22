package hardtask;

import java.util.Scanner;

public class HardSeven {

    public static final String IS_ADMIN = "isAdmin";
    public static final String IS_REGISTERED = "isRegistered";
    public static final String IS_EMAIL_VERIFIED = "isEmailVerified";

    public static void main(String[] args) {
        //Проверка прав доступа: Напишите программу, которая проверяет права доступа пользователя. Пользователь получает доступ,
        //если он администратор (isAdmin) или зарегистрирован (isRegistered) и подтвердил свой email (isEmailVerified).
        Scanner sc = new Scanner(System.in);

        System.out.println("Проверка доступа: ");

        String login = sc.next();

        System.out.println("Проверка почты: ");

        String email = sc.next();
        if (login.equals("IS_ADMIN") || login.equals("IS_REGISTERED") && email.equals("IS_EMAIL_VERIFIED")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
