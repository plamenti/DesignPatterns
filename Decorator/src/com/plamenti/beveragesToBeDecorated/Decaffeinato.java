package com.plamenti.beveragesToBeDecorated;

public class Decaffeinato extends Beverage{
    public Decaffeinato(){
        description = "Decaffeinated coffee";
    }

    @Override
    public double cost(){
        return 1.05;
    }
}
