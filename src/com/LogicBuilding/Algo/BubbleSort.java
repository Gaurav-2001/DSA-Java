package com.LogicBuilding.Algo;

import java.util.Arrays;
//in bubble sort we are asked to sort by selecting the item then coparing it with other items
//        one by one
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1};
        System.out.print(Arrays.toString(bubble_sort(arr)));

    }
    private static int[] bubble_sort(int[] arr){
        boolean isswap;
        for (int i = 0; i < arr.length; i++) {
            isswap = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isswap = true;
                }
            }
            if (!isswap)
                break;
        }
        return arr;
    }
}
