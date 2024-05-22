package hardtask;

import java.util.Scanner;

public class HardTen {
    public static void main(String[] args) {
        //Проверка на выполнение условий займа: Напишите программу, которая проверяет, может ли человек получить займ.
        //Человек может получить займ, если его возраст больше 18 лет (age > 18), его кредитный рейтинг
        //выше 700 (creditScore > 700) и он имеет стабильный источник дохода (hasStableIncome).
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        System.out.println("Введите кредитный рейтинг: ");
        int creditScore = sc.nextInt();

        System.out.println("Источник дохода стабилен? (true/false)");
        boolean hasStableIncome = sc.nextBoolean();

        if (age > 18 && creditScore > 700 && hasStableIncome) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
