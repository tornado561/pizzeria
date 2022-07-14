package pl.krzysztof.Toppings;


import pl.krzysztof.Decorator.ToppingsDecorator;
import pl.krzysztof.Factory.Pizza;

public class Ananas extends ToppingsDecorator {

    private final Pizza pizza;

    public Ananas(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Ananas, ";
    }

    @Override
    public double getCost() {
        return 0 + pizza.getCost();
    }

}
