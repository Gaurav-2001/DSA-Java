package com.LogicBuilding.WarmUpPrograms;

import java.util.Scanner;

//Write a program to add two numbers.
public class Prg01 {
    public static void main(String[] args) {
        System.out.print("Please enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("Sum of " + x + " & " + y + " is " + (x + y));
    }
}
