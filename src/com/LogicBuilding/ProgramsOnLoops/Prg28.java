package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to convert a binary number to a decimal number improved logic.
public class Prg28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int temp,count=0,binary = sc.nextInt();
        temp = binary;
        while(temp>0){
            count++;
            temp=temp/10;
        }
//        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if(binary%10==1) {
                temp = temp + powerof2(i);
            }
            binary = binary/10;
        }
        System.out.println(temp);
    }
    static int powerof2(int power){
        int prd=1;
        for (int j = 0; j < power; j++) {
            prd = prd * 2;
        }
        return prd;
    }
}
