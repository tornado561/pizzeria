package pl.krzysztof.Pizza;

import pl.krzysztof.Factory.Pizza;

public class MediumSizePizza extends Pizza {

    public MediumSizePizza() {
        description = "Srednia z ";
    }


    @Override
    public double getCost() {                                //returns the cost of medium size pizza
        return 25;
    }


}
