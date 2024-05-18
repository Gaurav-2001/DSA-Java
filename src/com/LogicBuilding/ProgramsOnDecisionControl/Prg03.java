package com.LogicBuilding.ProgramsOnDecisionControl;

import java.util.Scanner;

public class Prg03 {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
}
