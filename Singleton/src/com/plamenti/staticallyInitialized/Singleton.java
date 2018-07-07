package com.plamenti.staticallyInitialized;

public class Singleton{
    private static Singleton INSTANCE = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return INSTANCE;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton with public static Factory Method!";
    }
}
