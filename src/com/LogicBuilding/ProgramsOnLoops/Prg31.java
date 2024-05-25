package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Prime number improved method
public class Prg31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(),c=2;
        if (n==1){
            System.out.print("Not a prime number");
        }
        while (c*c<=n){
            if (n%c==0){
                System.out.print("not a prime");
                break;
            }
            c++;
        }
        if (c*c>n)
            System.out.print("It's a prime");

    }
}
