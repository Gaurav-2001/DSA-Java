package com.LogicBuilding.ProgramsOnDecisionControl;

import java.util.Scanner;

public class Prg02 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
    }
}
