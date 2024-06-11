package com.LogicBuilding.Algo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {-5,3,2,4,1,0};
        int[] ans = recursiveMergeSort(arr);
        System.out.print(Arrays.toString(ans));
    }
    private static int[] recursiveMergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = recursiveMergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = recursiveMergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i=0,j=0,k=0;
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}
