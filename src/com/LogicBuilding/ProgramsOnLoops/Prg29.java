package com.LogicBuilding.ProgramsOnLoops;
// print ascii value
public class Prg29 {
    public static void main(String[] args) {
        char a = 'A';
        for (int i = 0; i <26 ; i++) {
            System.out.println((char)(65+i) + " = " + ((int)a+i));
        }

    }
}
