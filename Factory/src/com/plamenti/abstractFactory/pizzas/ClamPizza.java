package com.plamenti.abstractFactory.pizzas;

import com.plamenti.abstractFactory.ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        clam = pizzaIngredientFactory.createClam();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
