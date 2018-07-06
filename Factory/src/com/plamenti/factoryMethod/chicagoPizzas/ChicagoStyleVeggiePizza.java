package com.plamenti.factoryMethod.chicagoPizzas;

import com.plamenti.factoryMethod.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
