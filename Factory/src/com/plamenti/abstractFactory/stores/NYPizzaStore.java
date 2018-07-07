package com.plamenti.abstractFactory.stores;

import com.plamenti.abstractFactory.ingredients.NYPizzaIngredientFactory;
import com.plamenti.abstractFactory.ingredients.PizzaIngredientFactory;
import com.plamenti.abstractFactory.pizzas.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        }else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");

        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }

        return pizza;
    }
}
