package com.plamenti.factoryMethod.nyPizzas;

import com.plamenti.factoryMethod.Pizza;

public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza(){
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
