package com.PracticeJava;

import java.util.Scanner;

public class Prg01 {
    public static void main(String[] args) {
        //printing hello world
        System.out.println("Hello world");

        //typecasting and data-types importance.
        int a = 65;
        char char_a = 'a';
        System.out.println((char)a);
        System.out.println(a);

        //taking inputs from keyboard.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
//        int num = sc.nextInt(); // this will take integer as input
//        String input = sc.next(); // this will take single words
//        char mychar = sc.next().charAt(0); // this will take single character input
        String input = sc.nextLine(); // this will take multiple words
        System.out.println("Hi " + input );

        // Expression datatype - always the bigger data type
        int x = 10;
        int y = 20;
        System.out.println(x+y); //30
        char m = 'a';
        char n = 'b';
        System.out.println(m+n); //195
        String s1 = "gaurav";
        String s2 = "pagare";
        System.out.println(s1+s2); //gauravpagare

        //coercion - automatic datatype conversion
        int z = 10;
        byte p = 20;
        System.out.println(z+p);//30


        //radix in scanner class

        sc.useRadix(2); // after this only binnary input will be valid
        System.out.println(sc.nextInt()); // input 111 o/p-7

    }
}
