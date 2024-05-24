package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg15 {
    public static void main(String[] args) {
        int n=5,k=0;
        for (int i = 1; i <=(2*n-1) ; i++) {
            if (k>=i)
                k--;
            else
                k++;
            for (int j = 1; j <=5 ; j++) {
                if (j>=n+1-k){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
