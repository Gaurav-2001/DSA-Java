package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg14 {
    public static void main(String[] args) {
        int n=7,k;
        for (int i = 0; i < n; i++) {
            k=n-i;
            for (int j = 0; j < n ; j++) {
                if (j<n-i){
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
