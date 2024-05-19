package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

// Write a program to convert a binary number to a decimal number.
public class Prg27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int x = sc.nextInt();
        System.out.println(x);
    }
}
