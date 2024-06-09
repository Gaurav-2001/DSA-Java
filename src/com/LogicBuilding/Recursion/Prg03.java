package com.LogicBuilding.Recursion;
//Write a recursive function to calculate the factorial of a number.
import java.util.Scanner;

public class Prg03 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.printf("The factorial of number %d is %d",n,fact(n));
    }

    private static int fact(int n) {
        if (n<2){
            return 1;
        }
        return fact(n-1)*n;
    }
}
