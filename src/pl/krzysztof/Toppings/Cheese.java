package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Cheese extends ToppingsDecorator {


    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public String getDescription() {
        return pizza.getDescription() + "Dodatkowy Ser, ";
    }

    @Override
    public double getCost() {
        return 1.85 + pizza.getCost();
    }


}
