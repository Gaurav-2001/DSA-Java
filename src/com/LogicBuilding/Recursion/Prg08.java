package com.LogicBuilding.Recursion;
// Approach 2: Reverse a number using recursion
public class Prg08 {
    static int sum =0;
    public static void main(String[] args) {
        int n=1234;
        reverse(n);
        System.out.print(sum);
    }
    private static void reverse(int n){
        if (n==0)
            return;
        sum = sum*10 + n%10;
        reverse(n/10);


    }
}
