package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the first N even natural numbers in reverse order
public class Prg10 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = n; i >= 1; i--) {
            if(0 == (i & 1)){
                System.out.println(i);
            }
        }
    }
}
