package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg13 {
    public static void main(String[] args) {
        int n=5,k=0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=2*n-1 ; j++) {
                if (j>=n+1-i && j<=n-1+i) {
                    if (j<=n)
                        k++;
                    else
                        k--;
                    System.out.print(" "+k+" ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
