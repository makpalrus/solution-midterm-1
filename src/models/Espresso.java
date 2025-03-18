package models;

import java.util.List;

public class Espresso extends Coffee {
    public Espresso(String size, List<String> additions) {
        super("Espresso", 2.0, size, additions);
    }
}
