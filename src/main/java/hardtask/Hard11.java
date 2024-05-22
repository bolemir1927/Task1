package hardtask;

import java.util.Scanner;

// ' {}' - не нужно использовать чтобы просто обрамлять логику - используется только в условных выражения if/else, для создания метода, класса
public class Hard11 {
    public static void main(String[] args) {
        //Проверка прав доступа:Пользователь может получить доступ к ресурсу,
        //если он администратор (isAdmin) или модератор (isModerator).
        Scanner sc = new Scanner(System.in);

        System.out.println("Проверка доступа: ");

        String login = sc.next();

        if (login.equals("isAdmin") || login.equals("isModerator")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
