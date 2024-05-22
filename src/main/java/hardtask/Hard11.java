package hardtask;

import java.util.Scanner;

public class Hard11 {
    public static void main(String[] args) {
        //Проверка прав доступа:Пользователь может получить доступ к ресурсу,
        //если он администратор (isAdmin) или модератор (isModerator).
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Проверка доступа: ");
        }
        String login = sc.next();

        if (login.equals("isAdmin") || login.equals("isModerator")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();


    }
}
