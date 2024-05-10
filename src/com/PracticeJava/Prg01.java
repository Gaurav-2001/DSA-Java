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
        String input = sc.nextLine(); // this will take multiple words
        System.out.println("Hi " + input );

    }
}
