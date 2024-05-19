package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;
//print prime number between 2 numbers
public class Prg24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt(), b= sc.nextInt();
        for (int n = a; n <= b; n++) {
            int i;
            for (i = 2; i < n; i++) {
                if(n%i==0)
                    break;
            }
            if(i==n){
                System.out.println(n);
            }
        }

    }
}
