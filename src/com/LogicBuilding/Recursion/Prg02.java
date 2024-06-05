package com.LogicBuilding.Recursion;

public class Prg02 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,21,34,65,98,100};
        int target = 34;
        System.out.printf("found at index %d",binary_search(target,0, arr.length-1,arr));

    }
    private static int binary_search(int target, int start, int end, int[] arr){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] > target){
            return binary_search(target,start,mid-1,arr);
        }
        else if(arr[mid] < target){
            return binary_search(target,mid+1,end,arr);
        }
        return mid;
    }
}
