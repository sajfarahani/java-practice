package com.javapractice;

import sun.print.BackgroundLookupListener;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.ini);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {

        Gearbox mclaren = new Gearbox(6);


/*        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));*/

        class ClickListner implements Button.OnClickListener {
            public ClickListner{
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListner(new ClickListner());
    }
}
