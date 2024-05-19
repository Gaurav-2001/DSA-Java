package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;
//Write a program to print all prime factors of a given number. For example, prime factors of 36 are 2, 2, 3, 3.
//find factorial of a number
public class Prg25 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int find_factor = sc.nextInt();
        for(int n=2;n<find_factor;n++){
            if(find_factor%n==0){
                //the number is not prime
                System.out.println(n);
                find_factor = find_factor/n;
                if (find_factor == n) {
                    System.out.println(n);
                }
                n=1;
            }
        }
    }
}
