package com.plamenti.Behaviors.QuackBehaviors;

import com.plamenti.Interfaces.QuackBehavior;

public class FakeQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Fake quack...");
    }
}
