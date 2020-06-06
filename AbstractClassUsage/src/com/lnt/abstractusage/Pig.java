package com.lnt.abstractusage;

public class Pig extends Animal{

    public void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    public void animalSound() {
        System.out.println("animal sound");
    }
}
