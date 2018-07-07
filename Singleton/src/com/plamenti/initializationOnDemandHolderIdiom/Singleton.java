package com.plamenti.initializationOnDemandHolderIdiom;

public class Singleton{
    private Singleton(){
    }

    private static class SingletonHelper{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe initialization On Demand Holder Idiom!";
    }
}
