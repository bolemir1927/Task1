package hardtask;

import java.util.Scanner;

public class Hard14 {
    public static void main(String[] args) {
        //Проверка статуса заказа:Заказ считается выполненным (isCompleted), если он оплачен (isPaid) и доставлен (isDelivered).
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Оплата заказа: ");
        }
        String isPaid = sc.next();
        {
            System.out.println("Доставка заказа: ");
        }
        String isDelivered = sc.next();
        if (isPaid.equals("isPaid") && isDelivered.equals("isDelivered")) {
            System.out.println("isCompleted");
        } else {
            System.out.println("isNoCompleted");
        }
        sc.close();
    }
}
