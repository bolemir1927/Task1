package finishTask;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Проверка возраста для кинотеатра:Пользователь допущен к просмотру фильма,
        //если его возраст больше или равен 18 годам (age >= 18) или он пришел в сопровождении взрослого.
        final int minAge = 18;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш возрас: ");

        int age = sc.nextInt();
        System.out.println("Сопровождает взрослый: ");
        String adult = sc.next();

        if (age >= 18 && adult.equals("yes")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
