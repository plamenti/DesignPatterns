package com.plamenti.Behaviors.FlyBehaviors;

import com.plamenti.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I'm flying...");
    }
}
