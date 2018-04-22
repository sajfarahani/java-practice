package com.example.mypackage;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
	    String varFour = "This is private to main()";

	    ScopeCheck scopeCheck = new ScopeCheck();
	    scopeCheck.useInner();

	    ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);

//        System.out.println("scopeInstance varOne is " + scopeCheck.getVarOne());
//        System.out.println(varFour);
//
//        scopeCheck.timesTwo();
//        System.out.println("******************************************");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
}
