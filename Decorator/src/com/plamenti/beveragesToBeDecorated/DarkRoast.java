package com.plamenti.beveragesToBeDecorated;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark roasted coffee";
    }

    @Override
    public double cost(){
        return 0.99;
    }
}
