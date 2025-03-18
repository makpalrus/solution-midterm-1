package models;

import java.util.List;

public class Latte extends Coffee {
    public Latte(String size, List<String> additions) {
        super("Latte", 3.5, size, additions);
    }
}
