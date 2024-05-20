package hardtask;

import java.util.Scanner;

public class HardFive {
    public static void main(String[] args) {
        //Проверка года на високосность или наличие 29 февраля: Напишите программу, которая запрашивает год
        //у пользователя и проверяет, является ли он високосным или содержит ли в себе 29 февраля.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int number = sc.nextInt();
        if (number%4 == 0  && number%100 != 0 || number%400 == 0){
            System.out.println(number + " високосный");
        }else {
            System.out.println(number + " невисокосный");
        }
    }
}
