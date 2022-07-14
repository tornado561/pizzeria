package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Pepperoni extends ToppingsDecorator {

    private final Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Peperoni, ";
    }

    @Override
    public double getCost() {
        return 2.0 + pizza.getCost();
    }


}
