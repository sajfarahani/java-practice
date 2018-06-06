package com.example.mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	int x =98;
//	int y =0;
//        System.out.println(dividedLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
        int x = getIntAFP();

//        int x = getInt();
        System.out.println("x is " + x);
    }

    public static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please entre an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please entre an integer ");
        try {
            return s.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static int dividedLBYL(int x, int y){
        if(y != 0){
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try{
            return x/y;
        } catch (ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}
