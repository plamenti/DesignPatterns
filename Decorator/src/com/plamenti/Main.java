package com.plamenti;

import com.plamenti.beveragesToBeDecorated.Beverage;
import com.plamenti.beveragesToBeDecorated.Espresso;

public class Main {

    public static void main(String[] args) {
        // Order some coffee without any condiment
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

    }
}
