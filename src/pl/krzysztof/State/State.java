package pl.krzysztof.State;

import pl.krzysztof.Factory.Pizza;

public abstract class State {
    protected Pizza pizza;

    State(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void next();
}
