package com.LogicBuilding.ProgramsOnDecisionControl;

import java.util.Scanner;

public class Prg04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a= sc.nextInt(),b= sc.nextInt(),c= sc.nextInt();
        System.out.println(greater(a,b,c));
    }
    static int greater(int a, int b, int c){
        return a>b?(a>c?a:c):(b>c?b:c);
//        return a>b?Math.max(a,c):Math.max(b,c);
    }
}
