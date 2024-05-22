package hardtask;

import java.util.Scanner;

public class HardNine {
    public static void main(String[] args) {
        //Проверка на участие в программе лояльности: Напишите программу, которая проверяет, является ли пользователь
        //участником программы лояльности. Пользователь является участником, если у него есть карта лояльности (hasLoyaltyCard)
        //или его сумма покупок за последний месяц превышает 5000 рублей (totalPurchases > 5000).
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Карта лояльности: ");
        }
        String hasLoyaltyCard = sc.next();
        {
            System.out.println("Сумма покупок: ");
        }
        int totalPurchases = sc.nextInt();

        if (totalPurchases > 5000 || hasLoyaltyCard.equals("hasLoyaltyCard")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();


    }
}
