package com.plamenti.Behaviors.QuackBehaviors;

import com.plamenti.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Squeaaak...");
    }
}
