package com.LogicBuilding.Recursion;
// doing sum of digits in a number using recursion

public class Prg05 {
    public static void main(String[] args) {
//        System.out.print(-135/10);
        int n = 1342;
        System.out.printf("sum of digits in %d is %d",n,digit_sum(n));
    }
    private static int digit_sum(int n){
        if (n<0){
            n=-n;
        }
        if (n<10){
            return n;
        }
        return n%10 + digit_sum(n/10);
    }
}
