package com.javapractice;

import com.sun.deploy.pings.Pings;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yokie!");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();

        }
}
