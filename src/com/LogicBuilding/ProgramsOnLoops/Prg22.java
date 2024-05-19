package com.LogicBuilding.ProgramsOnLoops;

import java.util.Scanner;

//Write a program to print all Armstrong numbers under 1000.
public class Prg22 {
    public static void main(String[] args) {
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
        for (int n = 0; n < 1000; n++) {
            int temp,sum=0,num;
            temp = n;
            while(temp>0){
                num=temp%10;
                sum = sum + (num*num*num);
                temp=temp/10;
            }
            if(sum==n)
                System.out.println(sum);
        }

    }
}
