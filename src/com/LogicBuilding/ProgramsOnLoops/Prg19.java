package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//program to count the digits in given number
public class Prg19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), count=0;
        while(n!=0){
            n=n/10;
//            System.out.println(n);
            count++;
        }

        System.out.println(count==0?1:count);
    }
}
