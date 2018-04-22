package com.example.mypackage;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance,int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    //Branch Argument is trure if the customer is performing the transaction
    //at a branch with a teller,
    //It's false if the customer is performing the transaction at an ATM
    public double deposite(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        if((amount > 500.00) & !branch){
            throw new IllegalArgumentException();
        }

        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

    //More methods that use the firstName, lastName, and perform other func.

}
