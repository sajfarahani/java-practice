package com.example.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8, 12);


        if(theatre.reserveSeat("D12")){
            System.out.println("Please ay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please ay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please ay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13.00));
        priceSeat.add(theatre.new Seat("A00", 13.00));

        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        printList(priceSeat);

    }

    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("====================================================");
    }
}
