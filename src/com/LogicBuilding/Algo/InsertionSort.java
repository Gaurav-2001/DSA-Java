package com.LogicBuilding.Algo;

import java.util.Arrays;
// in insertion sort we are basically sorting in parts
//example: [5,4,2,3,1]
//first sort till index 0,1 then 0,1,2 then 0,1,2,3 and so on
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-5,3,2,4,1,0};
        insertion_sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void insertion_sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1])
                    swap_index(arr,j,j-1);
                else
                    break;
            }
        }
    }
    private static void swap_index(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }


    }
