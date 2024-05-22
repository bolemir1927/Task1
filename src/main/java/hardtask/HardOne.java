package hardtask;

import java.util.Scanner;

public class HardOne {
    public static void main(String[] args) {
        //Проверка на четность и деление на 5: Напишите программу, которая проверяет, является ли целое число четным или делится ли оно на 5.
        //Если число четное или делится на 5, выведите сообщение об этом.
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = sc.nextInt();

        if (number % 2 == 0 || number % 5 == 0) {
            System.out.println("accept");
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}
