package models;

import java.util.List;

public abstract class Coffee {
    protected String name;
    protected double price;
    protected String size;
    protected List<String> additions;

    public Coffee(String name, double price, String size, List<String> additions) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.additions = additions;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getAdditions() {
        return additions;
    }

    public void setAdditions(List<String> additions) {
        this.additions = additions;
    }
}