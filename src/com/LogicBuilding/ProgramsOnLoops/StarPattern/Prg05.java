package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg05 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i+4 ; j++) {
                if(j>=6-i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}