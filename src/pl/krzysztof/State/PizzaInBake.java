package pl.krzysztof.State;

import pl.krzysztof.Factory.Pizza;

public class PizzaInBake extends State {

    PizzaInBake(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void next() {
        pizza.changeState(new PizzaDelivered(pizza));
    }

    @Override
    public String toString() {
        return "PIZZA W PIECU";
    }
}
