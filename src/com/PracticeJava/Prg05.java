package com.PracticeJava;

import java.util.Scanner;

public class Prg05 {
    public static void main(String[] args) {
        // Functions in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int i = mysum(sc.nextInt(), sc.nextInt());
        System.out.println(i);
    }
    // this is called function definition/ signature/ prototype
    // here int is the return type of the function
    static int mysum(int x, int y) {
//        int x=10,y=5;
        return x+y;
    }

    // note: by default any decimal number is double datatype
    // but if we wanted float mention f extra example. float a = 1.2f
}
