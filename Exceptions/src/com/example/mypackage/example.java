package com.example.mypackage;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide(){
        int x, y;
//        try{
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x/y;
//        } catch (NoSuchElementException e){
//            throw new ArithmeticException("no suitable input");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("Attempt to divide by zero");
//        }
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please entre an integer ");
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please entre a number only the digits 0 to 9");
            }
        }
    }
}
