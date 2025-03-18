package models;

import java.util.List;

public interface CoffeeComponent {
    String getName();
    double getPrice();
    String getSize();
    List<String> getAdditions();
}