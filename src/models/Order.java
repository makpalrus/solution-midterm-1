package models;

public class Order {
    private String coffeeName;
    private double price;

    public Order(String coffeeName, double price) {
        this.coffeeName = coffeeName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Заказ: " + coffeeName + " - $" + price;
    }
}