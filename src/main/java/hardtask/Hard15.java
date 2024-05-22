package hardtask;

import java.util.Scanner;

public class Hard15 {
    public static void main(String[] args) {
        //Проверка наличия мест в группе:Ученик может присоединиться к группе, если в ней есть свободные
        //места (availableSpots > 0) и его возраст соответствует требованиям (age >= minAge && age <= maxAge).

        //final чтобы нельзя было изменить, и переместил в начало. переменные что не меняются или объявляеются
        // и используется лучше переносить перед основной логикой
        final int  minAge = 17;
        final int maxAge = 23;

        Scanner sc = new Scanner(System.in);

        System.out.println("Количество свободных мест: ");
        int availableSpots = sc.nextInt();

        System.out.println("Введите возраст: ");
        int age = sc.nextInt();

        if (availableSpots > 0 && age >= minAge && age <= maxAge) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
