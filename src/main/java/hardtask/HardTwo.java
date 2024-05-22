package hardtask;

import java.util.Scanner;

public class HardTwo {
    public static void main(String[] args) {
        //Проверка года на високосность: Напишите программу, которая проверяет, является ли заданный год високосным.
        //Год високосный, если он делится на 4 без остатка, но не делится на 100, либо если он делится на 400 без остатка.
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " невисокосный");
        }
        sc.close();
    }
}
