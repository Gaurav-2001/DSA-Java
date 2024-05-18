package com.LogicBuilding.ElementryTrickyPrograms;

public class Prg03 {
    public static void main(String[] args) {
        int a=3,b=2;
        System.out.println(a + " " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " " + b);
    }
}
