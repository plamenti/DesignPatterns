package com.plamenti.abstractFactory.ingredients;

import com.plamenti.abstractFactory.ingredients.cheese.Cheese;
import com.plamenti.abstractFactory.ingredients.cheese.MozzarellaCheese;
import com.plamenti.abstractFactory.ingredients.clams.Clams;
import com.plamenti.abstractFactory.ingredients.clams.FrozenClams;
import com.plamenti.abstractFactory.ingredients.dough.Dough;
import com.plamenti.abstractFactory.ingredients.dough.ThickCrustDough;
import com.plamenti.abstractFactory.ingredients.pepperoni.Pepperoni;
import com.plamenti.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import com.plamenti.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import com.plamenti.abstractFactory.ingredients.sauce.Sauce;
import com.plamenti.abstractFactory.ingredients.veggies.BlackOlives;
import com.plamenti.abstractFactory.ingredients.veggies.Eggplant;
import com.plamenti.abstractFactory.ingredients.veggies.Spinach;
import com.plamenti.abstractFactory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough(){
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies(){
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam(){
        return new FrozenClams();
    }
}