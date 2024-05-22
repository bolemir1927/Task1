package hardtask;

import java.util.Scanner;

// ' {}' - не нужно использовать чтобы просто обрамлять логику - используется только в условных выражения if/else, для создания метода, класса
public class Hard13 {
    public static void main(String[] args) {
        //Проверка достаточности денег для покупки товара:Пользователь может купить товар,
        //если у него достаточно средств на счете (balance >= price) и товар доступен на складе (isAvailable).
        Scanner sc = new Scanner(System.in);

        System.out.println("Стоимость: ");

        int price = sc.nextInt();

        System.out.println("Деньги на карте: ");

        int balance = sc.nextInt();

        System.out.println("Наличие товара: ");
        String isAvailable = sc.next();

        if (balance >= price && isAvailable.equals("isAvailable")) { //и товар доступен на складе (isAvailable)
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
