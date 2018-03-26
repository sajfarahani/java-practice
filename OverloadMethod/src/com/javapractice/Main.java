package com.javapractice;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double FeetandInchestoCentimeters = calcFeetAndInchesToCentimeters(2, 10);
        System.out.println("Method1: " + FeetandInchestoCentimeters);

        double FeetandInchestoCentimeters2 = calcFeetAndInchesToCentimeters(156);
        System.out.println("Method2: " + FeetandInchestoCentimeters2);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12.0))) {
            System.out.println("The input is incorrect!");
            return -1;
        } else {
            //Converting feet to inches then into centimeters
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet," + inches + " inches =" + centimeters + " cm");
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            //Break down to feet and inches.
            int feetInInches = (int) inches / 12;
            double inchesLeft = (int) inches % 12;

            //Pass the parameters to the above method.
            return calcFeetAndInchesToCentimeters(feetInInches, inchesLeft);
        }
    }

}


