package com.cc.java;

public class Bird implements Flyable,Feathers {

    @Override
    public String fly() {
        return "I m a bird, I can fly!";
    }

    @Override
    public String hasFeathers() {
        return "Im a bird, I have feathers!";
    }
}