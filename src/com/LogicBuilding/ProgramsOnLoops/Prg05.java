package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the first N natural numbers in reverse order. (N is given by the user)
public class Prg05 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
