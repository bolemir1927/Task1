package hardtask;

import java.util.Scanner;

public class Hard16 {
    public static void main(String[] args) {
        //Проверка на участие в обеих акциях:Пользователь получает дополнительную скидку, если он участвует
        //и в акции "Скидка на товары категории A" (isCategoryADiscount) и в акции "Скидка на товары категории B"
        //(isCategoryBDiscount).
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Скидка на товары категории A(yes/no): ");
        }
        String isCategoryADiscount = sc.next();
        {
            System.out.println("Скидка на товары категории B(yes/no): ");
        }
        String isCategoryBDiscount = sc.next();
        if (isCategoryADiscount.equals("yes") && isCategoryBDiscount.equals("yes")) {
            System.out.println("Accept");
        } else {
            System.out.println("Error");
        }
        sc.close();
    }
}
