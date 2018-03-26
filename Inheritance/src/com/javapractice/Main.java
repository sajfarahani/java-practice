package com.javapractice;

public class Main {


    public static void main(String[] args) {

        Head head = new Head("head", 1,1,5, 5);

        Minor minor = new Minor("test", 8,20,2,4,1,20,"pram5");

        minor.consume();
       // minor.stepping();
        minor.fastStepping();


    }


}
