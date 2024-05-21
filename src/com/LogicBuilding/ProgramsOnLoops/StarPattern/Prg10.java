package com.LogicBuilding.ProgramsOnLoops.StarPattern;

public class Prg10 {
    public static void main(String[] args) {
        int k=0,rows=7,columns=7;
        for (int i = 1; i <=rows ; i++) {
            if(i<=((rows/2)+1))
                k++;
            else
                k--;
            for (int j = 1; j <=columns ; j++) {
                if (j>=5-k && j<=3+k){
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
