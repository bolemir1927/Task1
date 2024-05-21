package hardtask;

import java.util.Scanner;

public class HardSix {
    public static void main(String[] args) {
        //Проверка срока действия скидки: Напишите программу, которая проверяет, действует ли скидка в магазине.
        //Скидка действует, если сумма покупки больше 1000 рублей или товар находится в списке акционных.
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Проверка акции: ");
        }
        int number = sc.nextInt();
        {
            System.out.println("Проверка списка: ");
        }
        String spisok = sc.next();
        if (number > 1000 || spisok.equals("spisok")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
