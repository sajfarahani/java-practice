package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	Account sajjAccount = new Account("Sajj");
	sajjAccount.deposit(1000);
	sajjAccount.withdraw(500);
	sajjAccount.withdraw(-200);
	sajjAccount.deposit(-20);
	sajjAccount.calculateBalance();

	System.out.println("Balance on account is " + sajjAccount.getBalance());
    }
}
