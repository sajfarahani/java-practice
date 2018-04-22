package com.example.mypackage;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test case");
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Sajj", "Farahani", 1000.00, BankAccount.CHECKING);
        System.out.println("Setting up the test...");
    }

    @org.junit.Test
    public void deposite() throws Exception {
       double balance = account.deposite(200.00, true);
        assertEquals(1200, balance, 0);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600, true);
        assertEquals(400.00, balance, 0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600, false);
        fail("Should have thrown an IlegalAurgumentException");
    }


    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposite(200.00, true);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200.00, true);
        assertEquals(800, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue(account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + count++);
    }

}