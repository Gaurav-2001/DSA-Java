package com.LogicBuilding.ProgramsOnDecisionControl;

import java.util.Scanner;

public class Prg05 {
    public static void main(String[] args) {
        System.out.println("Enter the value of coefficient of the quadratic equations: ");
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble(),b= sc.nextDouble(), c= sc.nextDouble();
        System.out.println(a + "," + b + "," + c);
        double sqrt = Math.sqrt((b * b) - (4 * a * c));
        double root1 = (((-1)*b)+ sqrt)/(2*a);
        double root2 = (((-1)*b)- sqrt)/(2*a);
        System.out.println(sqrt);
        System.out.println(root1 + " " + root2);

    }
}
