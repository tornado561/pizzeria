package pl.krzysztof.Pizza;

import pl.krzysztof.Factory.Pizza;

public class FamilySizePizza extends Pizza {


    public FamilySizePizza() {
        description = "Gigant z ";
    }

    @Override
    public double getCost() {
        return 35;
    }


}
