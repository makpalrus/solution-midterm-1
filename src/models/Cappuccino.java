package models;

import java.util.List;

public class Cappuccino extends Coffee {
    public Cappuccino(String size, List<String> additions) {
        super("Cappuccino", 4.0, size, additions);
    }
}
