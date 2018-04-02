package com.javapractice;

public class Main {

    public static void main(String[] args) {
	ITelephone sajjPhone;
	sajjPhone = new DeskPhone(12345);
	sajjPhone.powerOn();
	sajjPhone.callPhone(123455);
	sajjPhone.answer();

	sajjPhone = new MobilePhone(23456);
	sajjPhone.powerOn();
	sajjPhone.callPhone(23456);
	sajjPhone.answer();
    }
}
