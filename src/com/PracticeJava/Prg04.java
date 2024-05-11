package com.PracticeJava;

public class Prg04 {
    public static void main(String[] args) {
        // Arrays
        // Array declaration/signature
        int[] x = {11,22,33,44}; // this will consume (3x4) bytes of space in heap memory of ram
        int a[] = new int[10];
        System.out.println(x.length); //4
        System.out.println(a.length); //10
        for(int i: a){
            System.out.println(i); //by default value of all the elements is 0
        }
    }
}
