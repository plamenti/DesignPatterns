package com.plamenti.withEnum;

public enum Singleton{
    INSTANCE;

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton using enum! No problems with Reflection and Serialization/Deserialization";
    }
}
