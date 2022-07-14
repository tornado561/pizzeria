package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Onions extends ToppingsDecorator {

    private final Pizza pizza;

    public Onions(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Cebula, ";
    }

    @Override
    public double getCost() {
        return 1.50 + pizza.getCost();
    }


}
