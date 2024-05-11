package com.LogicBuilding.WarmUpPrograms;

import java.util.Scanner;

//Write a program to calculate area of a circle
public class Prg02 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("area of the circle is " + (3.14*r*r));
    }
}
