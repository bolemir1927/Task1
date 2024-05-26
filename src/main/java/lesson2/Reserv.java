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

        int randomNum = (int) (Math.random() * 100);

        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        System.out.println("Я загадал число от 1 до 100. Попробуй угадать!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Попытка 1. Введите вашу догадку: ");
        int numberOne = sc.nextInt();

        if (numberOne == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 1 попытки!");
        } else if (numberOne > randomNum) {
            System.out.println("Меньше. У вас осталось 9 попыток.");
        } else if (numberOne < randomNum) {
            System.out.println("Больше. У вас осталось 9 попыток.");
        }
        int numberTwo = sc.nextInt();
        if (numberTwo == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 2 попытки!");
        } else if (numberTwo > randomNum) {
            System.out.println("Меньше. У вас осталось 8 попыток.");
        } else if (numberTwo < randomNum) {
            System.out.println("Больше. У вас осталось 8 попыток.");
        }
        int numberThree = sc.nextInt();
        if (numberThree == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 3 попытки!");
        } else if (numberThree > randomNum) {
            System.out.println("Меньше. У вас осталось 7 попыток.");
        } else if (numberThree < randomNum) {
            System.out.println("Больше. У вас осталось 7 попыток.");
        }
        int numberFour = sc.nextInt();
        if (numberFour == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 4 попытки!");
        } else if (numberFour > randomNum) {
            System.out.println("Меньше. У вас осталось 6 попыток.");
        } else if (numberFour < randomNum) {
            System.out.println("Больше. У вас осталось 6 попыток.");
        }
        int numberFive = sc.nextInt();
        if (numberFive == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 5 попытки!");
        } else if (numberFive > randomNum) {
            System.out.println("Меньше. У вас осталось 5 попыток.");
        } else if (numberFive < randomNum) {
            System.out.println("Больше. У вас осталось 5 попыток.");
        }
        int numberSix = sc.nextInt();
        if (numberSix == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 6 попытки!");
        } else if (numberSix > randomNum) {
            System.out.println("Меньше. У вас осталось 4 попыток.");
        } else if (numberSix < randomNum) {
            System.out.println("Больше. У вас осталось 4 попыток.");
        }
        int numberSeven = sc.nextInt();
        if (numberSeven == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 7 попытки!");
        } else if (numberSeven > randomNum) {
            System.out.println("Меньше. У вас осталось 3 попыток.");
        } else if (numberSeven < randomNum) {
            System.out.println("Больше. У вас осталось 3 попыток.");
        }
        int numberEight = sc.nextInt();
        if (numberEight == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 8 попытки!");
        } else if (numberEight > randomNum) {
            System.out.println("Меньше. У вас осталось 2 попыток.");
        } else if (numberEight < randomNum) {
            System.out.println("Больше. У вас осталось 2 попыток.");
        }
        int numberNine = sc.nextInt();
        if (numberNine == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 9 попытки!");
        } else if (numberNine > randomNum) {
            System.out.println("Меньше. У вас осталось 1 попыток.");
        } else if (numberNine < randomNum) {
            System.out.println("Больше. У вас осталось 1 попыток.");
        }
        int numberTen = sc.nextInt();
        if (numberTen == randomNum) {
            System.out.println("Поздравляю! Вы угадали число " + randomNum + " с 10 попытки!");
        } else if (numberTen != randomNum) {
            System.out.println("Вы проиграли");
        }
        sc.close();

    }
}
