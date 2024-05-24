package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg11 {
    public static void main(String[] args) {
        int k=0,n=7;
        for (int i = 1; i <= n; i++) {
            if(i<=((n/2)+1))
                k++;
            else
                k--;
            for (int j = 1; j <=((n/2)+1) ; j++) {
                if(j<=k)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
