package decorators;

import models.CoffeeComponent;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(CoffeeComponent coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.5;
    }

    @Override
    public String toString() {
        return coffee + " + Milk";
    }
}
