package com.javapractice;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Hamburger hamburger = new Hamburger("Basic", "White","Suasage", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lattuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is: " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Olives", 3.41);
        System.out.println("Total Healthy Burger price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();


    }
}
