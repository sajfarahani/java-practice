package com.javapractice;

public class Main {

    public static void main(String[] args) {
/*	    Player player = new Player();
	    player.fullName ="sajj";
	    player.health=20;
	    player.weapon="Sword";

	    int damage = 10;
		player.loseHealth(damage);
		System.out.println("Ramaining health = " + player.healthRemaining());

		damage = 11;
		player.health = 200;
		player.loseHealth(damage);
		System.out.println("Ramaining health = " + player.healthRemaining());*/

/*        EnhancedPlayer player = new EnhancedPlayer("palyer1", 200 , "Sword");
        System.out.println("Initial health is " + player.getHealth());*/

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
