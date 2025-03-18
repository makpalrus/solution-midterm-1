package decorators;

import models.CoffeeComponent;
import java.util.List;

public abstract class CoffeeDecorator implements CoffeeComponent {
    protected CoffeeComponent coffee;

    public CoffeeDecorator(CoffeeComponent coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return coffee.getName();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getSize() {
        return coffee.getSize();
    }

    @Override
    public List<String> getAdditions() {
        return coffee.getAdditions();
    }
}
