package lesson2;

import java.util.Scanner;

public class Reserv {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println(number + ++i);
        }

        System.out.println("Добро пожаловать в калькулятор команд!");
        System.out.println("Введите команду (+, -, *, /): ");
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        switch (command) {
            case "+" -> System.out.println("+");
            case "-" -> System.out.println("-");
            case "*" -> System.out.println("*");
            case "/" -> System.out.println("/");
            default -> System.out.println("Ошибка ввода");
        }

        System.out.println("Введите первое число: ");
        int numberOne = sc.nextInt();

        System.out.println("Введите второе число: ");
        int numberTwo = sc.nextInt();

        if (command.equals("+")) {
            System.out.println("Результат: " + (numberOne + numberTwo));
        } else if (command.equals("-")) {
            System.out.println("Результат: " + (numberOne - numberTwo));
        } else if (command.equals("*")) {
            System.out.println("Результат: " + (numberOne * numberTwo));
        } else if (command.equals("/")) {
            System.out.println("Результат: " + (numberOne / numberTwo));
        } else {
            System.out.println("Ошибка ввода");
        }
        sc.close();

    }
}
