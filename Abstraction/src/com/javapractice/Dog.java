package com.javapractice;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is Eating!");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat!");

    }
}
