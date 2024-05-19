package com.LogicBuilding.ProgramsOnLoops;
//Write a program to print the first 10 odd natural numbers.
public class Prg07 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if(0 != (i & 1)){
                System.out.println(i);
            }
        }
    }
}
