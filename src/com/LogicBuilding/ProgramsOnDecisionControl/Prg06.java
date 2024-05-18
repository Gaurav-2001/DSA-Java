package com.LogicBuilding.ProgramsOnDecisionControl;

import java.util.Scanner;

public class Prg06 {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner sc = new Scanner(
                System.in
        );
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap");
        }
        else {
            System.out.println("not a leap");
        }
    }
}
