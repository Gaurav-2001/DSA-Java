package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to calculate the sum of the first N odd natural numbers
public class Prg17 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt(), sum_odd=0;
        for (int i = 0; i <= n ; i++) {
            if(i%2!=0)
                sum_odd = sum_odd + i;
        }
        System.out.println(sum_odd);
    }
}
