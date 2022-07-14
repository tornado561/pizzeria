package pl.krzysztof.Factory;


import pl.krzysztof.State.PizzaInPrepare;
import pl.krzysztof.State.State;

public abstract class Pizza {

    protected String description = "Unknown Pizza";
    protected State state;
    protected double cost = 0.0;

    public Pizza() {
        this.state = new PizzaInPrepare(this);
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Pizza: " +
                "opis=" + this.getDescription() +
                ", status=" + state +
                ", cena=" + this.getCost() + "zl";
    }
}
