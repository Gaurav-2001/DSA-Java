package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the first n even natural numbers.
public class Prg09 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if(0 != (i & 1)){
                System.out.println(i);
            }
        }
    }
}
