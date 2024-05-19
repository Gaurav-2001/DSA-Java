package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Program to print the first n positive numbers with two bits set.
public class Prg30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
