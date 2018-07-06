package com.plamenti.factoryMethod.chicagoPizzas;

import com.plamenti.factoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
