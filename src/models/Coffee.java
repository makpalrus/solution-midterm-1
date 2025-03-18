package models;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String name;
    private double basePrice;
    private String size;
    private double sizePrice;
    private String strength;
    private double strengthPrice;
    private List<String> additions;
    private double totalPrice;

    public Coffee(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.totalPrice = basePrice;
        this.additions = new ArrayList<>();
    }

    public void setSize(String size, double sizePrice) {
        this.size = size;
        this.sizePrice = sizePrice;
        this.totalPrice += sizePrice;
    }

    public void setStrength(String strength, double strengthPrice) {
        this.strength = strength;
        this.strengthPrice = strengthPrice;
        this.totalPrice += strengthPrice;
    }

    public void addAddition(String addition, double price) {
        additions.add(addition);
        this.totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDescription() {
        return name + " (" + size + ", " + strength + ") - $" + totalPrice +
                "\nДобавки: " + (additions.isEmpty() ? "Нет" : String.join(", ", additions));
    }
}
