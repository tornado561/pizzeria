package pl.krzysztof.State;

import pl.krzysztof.Factory.Pizza;

public class PizzaDelivered extends State {
    PizzaDelivered(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void next() {
        System.out.println("PIZZA ZOSTALA JUZ DOSTARCZONA!");
        System.out.println("Nie mozna zmienic statusu!");
    }

    @Override
    public String toString() {
        return "PIZZA DOSTARCZONA";
    }
}
