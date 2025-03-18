import models.*;
import payments.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = null;

        int coffeeChoice;
        do {
            System.out.println("Выберите кофе: \n1 - Эспрессо ($2.0) \n2 - Латте ($3.5) \n3 - Капучино ($4.0)");
            coffeeChoice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера
            switch (coffeeChoice) {
                case 1:
                    coffee = new Espresso("Средний", new ArrayList<>());
                    break;
                case 2:
                    coffee = new Latte("Средний", new ArrayList<>());
                    break;
                case 3:
                    coffee = new Cappuccino("Средний", new ArrayList<>());
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
            }
        } while (coffee == null);

        System.out.println("Вы выбрали: " + coffee.getName() + " - $" + coffee.getPrice());

        int sizeChoice;
        do {
            System.out.println("Выберите размер: \n1 - Маленький (-$0.5) \n2 - Средний ($0.0) \n3 - Большой (+$1.0)");
            sizeChoice = scanner.nextInt();
            scanner.nextLine();

            if (sizeChoice == 1) {
                coffee.setSize("Маленький");
                coffee.setPrice(coffee.getPrice() - 0.5);
                break;
            } else if (sizeChoice == 2) {
                coffee.setSize("Средний");
                break;
            } else if (sizeChoice == 3) {
                coffee.setSize("Большой");
                coffee.setPrice(coffee.getPrice() + 1.0);
                break;
            } else {
                System.out.println("Неверный выбор размера! Попробуйте снова.");
            }
        } while (true);

        List<String> additions = new ArrayList<>();
        if (askYesNo(scanner, "Добавить молоко? (да/нет)")) additions.add("Молоко");
        if (askYesNo(scanner, "Добавить сахар? (да/нет)")) additions.add("Сахар");
        if (askYesNo(scanner, "Добавить сироп? (да/нет)")) additions.add("Сироп");

        coffee.setAdditions(additions);


        PaymentStrategy payment;
        int paymentChoice;
        do {
            System.out.println("Оплатить наличными (1) или картой (2)?");
            paymentChoice = scanner.nextInt();
            scanner.nextLine();

            if (paymentChoice == 1) {
                payment = new CashPayment();
                break;
            } else if (paymentChoice == 2) {
                System.out.print("Введите номер карты: ");
                String cardNumber = scanner.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;
            } else {
                System.out.println("Неверный выбор способа оплаты! Попробуйте снова.");
            }
        } while (true);


        payment.pay(coffee.getPrice());
        System.out.println("Заказ: " + coffee.getName() + " (" + coffee.getSize() + ") - $" + coffee.getPrice());
        System.out.println("Добавки: " + (additions.isEmpty() ? "Нет" : String.join(", ", additions)));
    }


    private static boolean askYesNo(Scanner scanner, String question) {
        String response;
        do {
            System.out.println(question);
            response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("да")) return true;
            if (response.equals("нет")) return false;
            System.out.println("Неверный ввод! Введите 'да' или 'нет'.");
        } while (true);
    }
}
