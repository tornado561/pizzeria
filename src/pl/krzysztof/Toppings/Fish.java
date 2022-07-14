package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Fish extends ToppingsDecorator {

    private final Pizza pizza;

    public Fish(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Ryba, ";
    }

    @Override
    public double getCost() {
        return 2.5 + pizza.getCost();
    }


}
