package com.plamenti;

import com.plamenti.beveragesToBeDecorated.*;
import com.plamenti.decorators.Mocha;
import com.plamenti.decorators.Soy;
import com.plamenti.decorators.Whip;

public class Main {

    public static void main(String[] args) {
        // Order some coffee without any condiment
        Beverage espresso = new Espresso();
        printOrderDescription(espresso);

        // Order Dark roasted coffee with Mocha and Whip condiments
        Beverage darkRoastedCoffee = new DarkRoast();
        darkRoastedCoffee = new Mocha(darkRoastedCoffee);
        darkRoastedCoffee = new Whip(darkRoastedCoffee);
        printOrderDescription(darkRoastedCoffee);

        // Order House blend coffee with Mocha, Whip and Soy condiments
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Soy(houseBlend);
        printOrderDescription(houseBlend);

        // Order Decaffeinato coffee with Mocha condiment
        Beverage decaffeinato = new Decaffeinato();
        decaffeinato = new Mocha(decaffeinato);
        printOrderDescription(decaffeinato);
    }

    private static void printOrderDescription(Beverage beverage){
        System.out.println("###################");
        System.out.println(beverage.getDescription() + " - $" + beverage.cost());
        System.out.println("###################");
    }
}
