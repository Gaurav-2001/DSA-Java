package com.LogicBuilding.Recursion;

import java.util.Arrays;

public class Prg17 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.print(Arrays.toString(selectionSort(arr, arr.length-1)));
    }

    private static int[] selectionSort(int[] arr,int last){
        if (last <=0){
            return arr;
        }
        int large = 0,temp;
        for (int i = 0; i <= last; i++) {
            if (arr[large]<=arr[i]){
                large = i;
            }
        }
        temp = arr[last];
        arr[last] = arr[large];
        arr[large] = temp;
        return selectionSort(arr, last-1);
    }

}
