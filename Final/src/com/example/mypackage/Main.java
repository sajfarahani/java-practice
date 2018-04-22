package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	SomeClass one = new SomeClass("One");
	SomeClass two = new SomeClass("two");
	SomeClass three = new SomeClass("three");

	System.out.println(one.getInstanceNumber());
	System.out.println(two.getInstanceNumber());
	System.out.println(three.getInstanceNumber());

	System.out.println(Math.PI);

    }
}
