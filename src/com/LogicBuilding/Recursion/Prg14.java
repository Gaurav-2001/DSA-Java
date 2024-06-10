package com.LogicBuilding.Recursion;
//Pattern printing using recursion
public class Prg14 {
    public static void main(String[] args) {
        pattern(4,0);
    }
    private static void pattern(int row, int column){
        if (row==0){
            return;
        }
        if(row>column){
            System.out.print(" * ");
            pattern(row,column+1);

        }
        else {
            System.out.print("\n");
            pattern(row-1,0);
        }
    }
}
