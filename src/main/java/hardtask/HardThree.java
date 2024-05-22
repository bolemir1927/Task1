package hardtask;

import java.util.Scanner;

public class HardThree {
    public static void main(String[] args) {
        //Проверка возраста для участия в соревнованиях: Напишите программу, которая запрашивает возраст участника и проверяет,
        //подходит ли он для участия в соревнованиях по плаванию.
        //Участник допускается к соревнованиям, если его возраст больше 12 лет и меньше или равен 16 годам.
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int number = sc.nextInt();

        if (number > 12 && number <= 16) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
