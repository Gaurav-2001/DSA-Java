package com.LogicBuilding.ProgramsOnLoops;
//Write a program to print the first 10 even natural numbers.
public class Prg06 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if((i&1)==0){
                System.out.println(i);
            }
        }
    }
}
