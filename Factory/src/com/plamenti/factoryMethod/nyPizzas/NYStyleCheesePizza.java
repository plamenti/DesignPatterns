package com.plamenti.factoryMethod.nyPizzas;

import com.plamenti.factoryMethod.Pizza;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano cheese");
    }
}
