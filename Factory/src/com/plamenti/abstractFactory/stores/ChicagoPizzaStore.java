package com.plamenti.abstractFactory.stores;

import com.plamenti.abstractFactory.ingredients.ChicagoPizzaIngredientFactory;
import com.plamenti.abstractFactory.ingredients.PizzaIngredientFactory;
import com.plamenti.abstractFactory.pizzas.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }
}
