package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to calculate the sum of the digits of a given number.
public class Prg20 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum =0, r;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
