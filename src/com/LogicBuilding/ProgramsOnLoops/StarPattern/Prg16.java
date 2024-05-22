package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg16 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                if (j == i ){
                    System.out.print("\\");
                } else if (j == n + 1 - i) {
                    System.out.print("/");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}
