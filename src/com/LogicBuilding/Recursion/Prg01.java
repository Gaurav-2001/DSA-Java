package com.LogicBuilding.Recursion;
//Write a recursive function to find the Nth term of the Fibonacci series.
public class Prg01 {
    public static void main(String[] args) {
        System.out.print(fibonacci(4));
    }
    private static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
