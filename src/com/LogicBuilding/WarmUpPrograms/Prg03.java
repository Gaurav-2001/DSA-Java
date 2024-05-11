package com.LogicBuilding.WarmUpPrograms;

import java.util.Scanner;

//Write a program which takes input as integers only that is restricted other characters from input
public class Prg03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int x = sc.nextInt(); //this does not allow any other value other than int or throws an error.
        System.out.println("you entered: " + x);
    }
}
