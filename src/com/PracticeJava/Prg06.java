package com.PracticeJava;

public class Prg06 {
    // method overloading or function overloading
    // there must be difference in function signature
    // note: if we have different return type of function that won't count for method overloading
    // this is because while returning explecit type casting can bee done.
    public static void main(String[] args) {
        float fun1 = mysum(1.2f,1.8f);
        int fun2 = mysum(3,5);
    }
    static float mysum(float x, float y){
        return x+y;
    }
    static int mysum(int x, int y){
        return x+y;
    }
}
