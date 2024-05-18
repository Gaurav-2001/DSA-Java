package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the table of user’s choice.
public class Prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println( n + "X" + i + "=" + n*i);
        }
    }
}
