package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg08 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            int count=1;
            for (int j = 1; j <= (2*n-1) ; j++) {
                if (j<=i+n-1 && j>=n+1-i) {
                    System.out.print(" " + count + " ");
                    if (j >= n) {
                        count--;
                    } else {
                        count++;
                    }
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
