package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to calculate the product of the first N natural numbers.
public class Prg14 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sn = new Scanner(System.in);
        int n =  sn.nextInt(), sum=1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
