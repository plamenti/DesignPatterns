package com.plamenti.decorators;

import com.plamenti.beveragesToBeDecorated.Beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
