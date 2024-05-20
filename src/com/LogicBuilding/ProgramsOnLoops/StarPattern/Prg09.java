package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg09 {
    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <= n; i++) {
            int count=65;
            for (int j = 1; j <= (2*n-1) ; j++) {
                if (j<=n+1-i || j>=n-1+i){
                    System.out.print(" "+ (char)count +" ");
                }
                else {
                    System.out.print("   ");
                }
                if(j>=n)
                    count--;
                else
                    count++;
            }
            System.out.print("\n");
        }
    }
}
