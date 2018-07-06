package com.plamenti.SimpleFactory;

public class ClamPiza extends Pizza{
    public ClamPiza(){
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White garlic sauce";
        toppings.add("Clam");
        toppings.add("Grated parmesan cheese");
    }
}
