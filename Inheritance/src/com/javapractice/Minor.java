package com.javapractice;

/**
 * Created by Sajj on 12/06/2017.
 */
public class Minor extends Head {

    private int param1;
    private int param2;
    private int param3;
    private int param4;
    private String param5;

    public Minor(String name, int size, int weight, int param1, int param2, int param3, int param4, String param5) {
        super(name, 1, 1, size, weight);
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;

    }

    private void chew() {
        System.out.println("Minor.chew() called");
    }

    @Override
    public void consume() {
        System.out.println("Minor.consume() called");
        chew();
        super.consume();
    }

    public void stepping(){
        System.out.println("Minor.stepping() was called");
        super.move(5);
    }

    public void fastStepping(){
        System.out.println("Minor.fastStepping() was called");
        move(10);
    }

    private void moveLegs(int pace){
        System.out.println("Minor.moveLegs() called");
    }

    @Override
    public void move(int pace) {
        System.out.println("Minor.move() called");
        moveLegs(pace);
        super.move(pace);
    }
}
