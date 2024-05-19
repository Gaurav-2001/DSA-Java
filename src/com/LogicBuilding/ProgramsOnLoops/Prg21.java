package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to reverse a number.
public class Prg21 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int r=0,t,n = sc.nextInt();
        while(n>0){
            t=n%10;
            r=t+r*10;
            n=n/10;
        }
        System.out.println(r);
    }
}
