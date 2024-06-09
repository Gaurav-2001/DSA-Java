package com.LogicBuilding.Recursion;

import java.util.ArrayList;

//Linear search with multiple occurrence
public class Prg13 {
    public static void main(String[] args) {
        linearSearchMultipleOccurrence(new int[]{1, 5,5,5 ,2, 3, 5, 8, 9},5,0);
        System.out.print(new_arr);
    }

    private static ArrayList<Integer> new_arr = new ArrayList<>();
    private static void linearSearchMultipleOccurrence(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (target == arr[index]){
            new_arr.add(index);
        }
        linearSearchMultipleOccurrence(arr,target,index+1);
    }
}
