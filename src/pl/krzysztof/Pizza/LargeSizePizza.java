package pl.krzysztof.Pizza;

import pl.krzysztof.Factory.Pizza;

public class LargeSizePizza extends Pizza {

    public LargeSizePizza() {
        description = "Duza z ";
    }

    @Override
    public double getCost() {                                 //returns the cost of large size pizza
        return 30;
    }


}
