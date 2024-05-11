package com.PracticeJava;

public class Prg02 {
    public static void main(String[] args) {
        // post and pre increment operator
        int x=10,y=5,k,z;
        k=++x+y; //k=16,y=5,x=11
        System.out.println(k);
        z=y++ +x + ++y +y; //
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
