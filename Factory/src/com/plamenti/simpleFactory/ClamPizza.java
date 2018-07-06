package com.plamenti.simpleFactory;

public class ClamPizza extends Pizza{
    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White garlic sauce";
        toppings.add("Clam");
        toppings.add("Grated parmesan cheese");
    }
}
