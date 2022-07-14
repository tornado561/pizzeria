package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Bacon extends ToppingsDecorator {

    private final Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Bekon, ";
    }

    @Override
    public double getCost() {
        return 2.75 + pizza.getCost();
    }


}
