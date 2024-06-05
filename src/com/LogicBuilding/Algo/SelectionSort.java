package com.LogicBuilding.Algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,-5,0,1,2,3};
        selection_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = maxIndex(arr,last);
            swap_index(arr,maxIndex,last);
        }
    }

    private static void swap_index(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int maxIndex(int[] arr,int last) {
        int max=0;
        for (int i = 0; i <= last ; i++) {
            if (arr[max]<arr[i])
                max = i;
        }
        return max;
    }

// this below method was also correct and is done by my own.

//    private static void selection_sort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int temp,j,max = 0;
//            for (j = 1; j < arr.length-i; j++) {
//                if (arr[max]<arr[j])
//                    max=j;
//            }
//            temp = arr[arr.length-i-1];
//            arr[arr.length-i-1] = arr[max];
//            arr[max] = temp;
//        }
//    }
}
