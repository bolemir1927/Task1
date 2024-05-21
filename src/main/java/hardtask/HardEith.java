package hardtask;

import java.util.Scanner;

public class HardEith {
    public static void main(String[] args) {
        //Проверка числа на принадлежность к интервалу: Напишите программу,
        //которая проверяет, принадлежит ли число интервалу от 10 до 20 или от 30 до 40.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (number > 10 && number < 20 || number > 30 && number < 40) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();

    }
}
