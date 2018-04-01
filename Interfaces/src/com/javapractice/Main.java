package com.javapractice;

public class Main {

    public static void main(String[] args) {
	ITelephone sajjPhone;
	sajjPhone = new DeskPhone(12345);
	sajjPhone.powerOn();
	sajjPhone.callPhone(123455);
	sajjPhone.answer();
    }
}
