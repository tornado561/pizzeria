package pl.krzysztof.Toppings;

import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Sausage extends ToppingsDecorator {

    private final Pizza pizza;

    public Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Kielbasa, ";
    }

    @Override
    public double getCost() {
        return 2.0 + pizza.getCost();
    }


}
