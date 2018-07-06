package com.plamenti.factoryMethod.nyPizzas;

import com.plamenti.factoryMethod.Pizza;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }
}
