package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Mushrooms extends ToppingsDecorator {

    private final Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Grzyby, ";
    }

    @Override
    public double getCost() {
        return 1.5 + pizza.getCost();
    }


}
