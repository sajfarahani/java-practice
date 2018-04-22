package com.example.mypackage;
// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface? package-private
// 2. the int variable SOME_CONSTANT? all interface variables are public static final
// 3. methodA? public
// 4. methodB and methodC? public (all interfaces methods are public)
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}