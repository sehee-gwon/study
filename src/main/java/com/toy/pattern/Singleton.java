package com.toy.pattern;

public class Singleton {
    private final static Singleton singleton = new Singleton();

    private Singleton getInstance() {
        return this.singleton;
    }

    private Singleton() {}
}
