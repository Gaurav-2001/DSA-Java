package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print the first N terms of the Fibonacci series.
public class Prg26 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int temp = 0, n = sc.nextInt(),x=1,y=0;
        for (int i = 0; i < n; i++) {
            System.out.println(temp);
            temp = x+y;
            x = y;
            y = temp;
        }

    }
}
