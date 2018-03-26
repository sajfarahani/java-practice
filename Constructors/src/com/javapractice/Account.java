package com.javapractice;

/**
 * Created by Sajj on 5/06/2017.
 */
public class Account {

    private String email;
    private double balance;
    private String phoneNumber;
    private String accountNumber;
    private String customerName;

    public Account(){
        this("Default email", 2.50, "Default phone", "56789", "Default name");
        System.out.println("Empty constructor called");
    }

    public Account(String email, double balance, String phoneNumber, String accountNumber, String customerName){
        System.out.println("Account with parameters called");
        this.email = email;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        System.out.println("Contrusctor with parameters have been called");
    }

    public Account(String email, String phoneNumber, String customerName) {
        this(email, 100.55, phoneNumber, "999" , customerName);
    }

    public void setAccountNumber (String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber (){
        return this.accountNumber;

    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance (){
        return this.balance;
    }

    public void setCustomerName (String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName (){
        return this.customerName;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getEmail (){
        return this.email;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber (){
        return this.phoneNumber;
    }

    public void Deposit (double deposit){
        this.balance += deposit;
        System.out.println("The balance is:" + this.balance);
    }

    public void Withdrawal (double withdrawal){

        if(this.balance - withdrawal < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawal;
            System.out.println("Withdrawal of " + withdrawal + " processed. Remaining balance= " + this.balance);
        }
    }

}
