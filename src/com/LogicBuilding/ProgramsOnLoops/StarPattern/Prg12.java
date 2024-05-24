package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg12 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= ((n/2)+1); i++) {
            for (int j = 1; j <= n ; j++) {
                if (j>=i && j<=n+1-i){
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
