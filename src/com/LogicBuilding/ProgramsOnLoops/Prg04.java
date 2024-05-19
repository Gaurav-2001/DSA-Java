package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the first N natural numbers. (N is given by the user)
public class Prg04 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
