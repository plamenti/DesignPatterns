package com.plamenti.staticallyInitialized;

public class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return instance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton with public static Factory Method!";
    }
}
