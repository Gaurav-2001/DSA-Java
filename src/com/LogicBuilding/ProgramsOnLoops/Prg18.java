package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to calculate x power y. (when user input x is 2 and y is 3 then the result will be 8)
public class Prg18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(),prd=1;
//        prd = prd*2; //2
//        prd = prd*2; //4
//        prd = prd*2; //8
        for (int i = 0; i < y; i++) {
            prd = prd * x;
        }
        System.out.println(prd);

    }
}
