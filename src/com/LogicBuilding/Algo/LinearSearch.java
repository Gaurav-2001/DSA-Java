package com.LogicBuilding.Algo;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  arr = {3,1,5,56,12,95};
        int target = 12;
        int ans =  linear_search(arr,target);
        System.out.print(ans);
    }
    static int linear_search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
