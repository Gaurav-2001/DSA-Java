package com.LogicBuilding.Recursion;

public class Prg07 {
    public static void main(String[] args) {
        System.out.print(reverse(-1234));
    }
    private static int reverse(int n){
        if (n<0)
            n=-n;
        if (n<10)
            return n;
        int count =0, temp=n,prd=1;
        while (temp!=0){
            temp = temp/10;
            count++;
        }
        for (int i = 0; i < count-1; i++) {
            prd=prd*10;
        }
        return (n%10)*prd + reverse(n/10);
    }
}
