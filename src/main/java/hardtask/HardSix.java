package hardtask;

import java.util.Scanner;

public class HardSix {

    public static final String SAMSUNG = "Samsung";

    public static void main(String[] args) {
        //Проверка срока действия скидки: Напишите программу, которая проверяет, действует ли скидка в магазине.
        //Скидка действует, если сумма покупки больше 1000 рублей или товар находится в списке акционных.
        Scanner sc = new Scanner(System.in);

        System.out.println("Проверка акции: ");
        int number = sc.nextInt();

        System.out.println("Введите фирму товара: ");
        String brandName = sc.next();

        if (number > 1000 || brandName.equals(SAMSUNG)) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
