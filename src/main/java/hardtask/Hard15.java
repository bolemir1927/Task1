package hardtask;

import java.util.Scanner;

public class Hard15 {
    public static void main(String[] args) {
        //Проверка наличия мест в группе:Ученик может присоединиться к группе, если в ней есть свободные
        //места (availableSpots > 0) и его возраст соответствует требованиям (age >= minAge && age <= maxAge).
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Количество свободных мест: ");}
        int availableSpots = sc.nextInt();
        {
            System.out.println("Введите возраст: ");}
        int minAge = 17;
        int maxAge = 23;
        int age = sc.nextInt();
        if (availableSpots > 0 && age >= minAge && age <= maxAge) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
