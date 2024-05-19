package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;
//tell if given number is prime or not
public class Prg23 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i;
        for (i = 2; i < n; i++) {
            if(n%i==0)
                break;
        }
        if(i==n){
            System.out.println(n);
        }
    }
}
