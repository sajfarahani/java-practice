package com.javapractice;

/**
 * Created by Sajj on 12/06/2017.
 */
public class Small extends Head{

    private int side;
    private int view;
    private int top;

    public Small(String name, int size, int weight, int side, int view, int top) {
        super(name, 1, 1, size, weight);
        this.side = side;
        this.view = view;
        this.top = top;
    }

    private void rest(){

    }
    private void moveBody(){

    }
    private void moveBack(){

    }

    private void slide(int pace){
        moveBody();
        moveBack();
        super.move(pace);
    }

}
