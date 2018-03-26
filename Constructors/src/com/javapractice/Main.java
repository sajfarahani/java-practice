package com.javapractice;

public class Main {

    public static void main(String[] args) {

/*    Account testAccount = new Account("myemail@email.com", 120.0, "041233445", "5555-3333",
            "Bob Jane");

    System.out.println(testAccount.getCustomerName());
    System.out.println(testAccount.getAccountNumber());

    testAccount.Withdrawal(100.0);

    testAccount.Deposit(50.0);
    testAccount.Withdrawal(100.0);

    testAccount.Deposit(51.0);
    testAccount.Withdrawal(100.0);

    Account testAccount2 = new Account("email@web.com", "12345", "test2");
    System.out.println(testAccount2.getAccountNumber()+ " name " + testAccount2.getCustomerName());*/



    VipPerson person1 = new VipPerson();
    System.out.println(person1.getName());

    VipPerson person2 = new VipPerson("person2", 25000.00);
    System.out.println(person2.getName());

    VipPerson person3 = new VipPerson("person3", 100.00, "person3@email.com");
    System.out.println(person3.getName());
    System.out.println(person3.getEmailAddress());



    }
}
