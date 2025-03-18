package decorators;

import models.CoffeeComponent;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(CoffeeComponent coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.2;
    }

    @Override
    public String toString() {
        return coffee + " + Sugar";
    }
}