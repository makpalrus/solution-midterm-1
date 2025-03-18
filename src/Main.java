import models.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Coffee> order = new ArrayList<>();

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + " ! Добро пожаловать в кофейню ☕");

        while (true) {
            System.out.println("Какой кофе вы хотите?\n1 - Горячий ☕\n2 - Холодный 🧊");
            getValidInput(scanner, 1, 2);

            System.out.println("Выберите кофе:\n1 - Эспрессо ($2.0)\n2 - Латте ($3.5)\n3 - Капучино ($4.0)\n4 - Американо ($3.0)");
            int coffeeChoice = getValidInput(scanner, 1, 4);

            Coffee coffee = switch (coffeeChoice) {
                case 1 -> new Coffee("Эспрессо", 2.0);
                case 2 -> new Coffee("Латте", 3.5);
                case 3 -> new Coffee("Капучино", 4.0);
                case 4 -> new Coffee("Американо", 3.0);
                default -> throw new IllegalStateException("Неверный выбор кофе");
            };

            System.out.println("Выберите размер:\n1 - Маленький (-$0.5)\n2 - Средний ($0.0)\n3 - Большой (+$1.0)");
            int sizeChoice = getValidInput(scanner, 1, 3);

            switch (sizeChoice) {
                case 1 -> coffee.setSize("Маленький", -0.5);
                case 2 -> coffee.setSize("Средний", 0.0);
                case 3 -> coffee.setSize("Большой", 1.0);
            }

            System.out.println("Выберите крепость:\n1 - Обычный (+$0.0)\n2 - Крепкий (+$0.3)\n3 - Очень крепкий (+$0.5)");
            int strengthChoice = getValidInput(scanner, 1, 3);

            switch (strengthChoice) {
                case 1 -> coffee.setStrength("Обычный", 0.0);
                case 2 -> coffee.setStrength("Крепкий", 0.3);
                case 3 -> coffee.setStrength("Очень крепкий", 0.5);
            }

            System.out.println("Добавки:");
            System.out.println("1 - Молоко (+$0.5)");
            System.out.println("2 - Сахар (+$0.3)");
            System.out.println("3 - Сироп (+$1.0)");

            if (askYesNo(scanner, "Добавить молоко? (да/нет)")) coffee.addAddition("Молоко", 0.5);
            if (askYesNo(scanner, "Добавить сахар? (да/нет)")) coffee.addAddition("Сахар", 0.3);
            if (askYesNo(scanner, "Добавить сироп? (да/нет)")) coffee.addAddition("Сироп", 1.0);

            order.add(coffee);

            if (!askYesNo(scanner, "Хотите добавить еще один напиток? (да/нет)")) break;
        }

        System.out.println("\nВаш заказ, " + name + " :");
        double totalAmount = 0;
        for (Coffee c : order) {
            System.out.println(c.getDescription());
            totalAmount += c.getTotalPrice();
        }
        System.out.println("Общая сумма: $" + totalAmount);

        System.out.println("Выберите способ оплаты:\n1 - Kaspi 💳\n2 - Halyk 🏦\n3 - Наличные 💵");
        int paymentMethod = getValidInput(scanner, 1, 3);

        String paymentType = switch (paymentMethod) {
            case 1 -> "Kaspi 💳";
            case 2 -> "Halyk 🏦";
            case 3 -> "Наличные 💵";
            default -> "Неизвестный способ";
        };

        System.out.println("Оплата через " + paymentType + ": $" + totalAmount);
        System.out.println("Спасибо за заказ, " + name + " ! Ждем вас снова ☕😊");
    }

    private static int getValidInput(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) {
                    scanner.nextLine(); // Очищаем буфер
                    return choice;
                }
            } else {
                scanner.next();
            }
            System.out.println("Некорректный ввод! Введите число от " + min + " до " + max + ".");
        }
    }

    private static boolean askYesNo(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.next().trim().toLowerCase();
            if (input.equals("да")) return true;
            if (input.equals("нет")) return false;
            System.out.println("Некорректный ввод! Введите 'да' или 'нет'.");
        }
    }
}
