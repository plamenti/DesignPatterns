package com.plamenti;

import com.plamenti.doubleCheckedLocking.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
