package com.LogicBuilding.ElementryTrickyPrograms;

import java.util.Scanner;
// checking even and odd using the bitwise operator
public class Prg04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
