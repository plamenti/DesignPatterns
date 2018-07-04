package com.plamenti.Behaviors.QuackBehaviors;

import com.plamenti.Interfaces.QuackBehavior;

public class Quack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack quack...");
    }
}
