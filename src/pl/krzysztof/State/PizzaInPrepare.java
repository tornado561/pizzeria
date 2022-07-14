package pl.krzysztof.State;

import pl.krzysztof.Factory.Pizza;

public class PizzaInPrepare extends State {

    public PizzaInPrepare(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void next() {
        pizza.changeState(new PizzaInBake(pizza));
    }

    @Override
    public String toString() {
        return "PIZZA W PRZYGOTOWANIU";
    }
}
