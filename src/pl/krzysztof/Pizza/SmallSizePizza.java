package pl.krzysztof.Pizza;

import pl.krzysztof.Factory.Pizza;

public class SmallSizePizza extends Pizza {

    public SmallSizePizza() {
        description = "Mala z ";
    }

    @Override
    public double getCost() {
        return 20;
    }


}
