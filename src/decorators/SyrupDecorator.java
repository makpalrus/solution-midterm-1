package decorators;

import models.CoffeeComponent;

public class SyrupDecorator extends CoffeeDecorator {
    public SyrupDecorator(CoffeeComponent coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.7;
    }

    @Override
    public String toString() {
        return coffee + " + Syrup";
    }
}