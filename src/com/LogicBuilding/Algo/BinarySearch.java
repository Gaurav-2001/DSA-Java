package com.LogicBuilding.Algo;

public class BinarySearch {
    public static void main(String[] args) {
        // this approach is valid if elements are in ascending order
        int[] arr = {-12,-10,-1,0, 8,9,32,45,98};
        int target = 100;
        System.out.print(binary_search(arr,target));

    }
    static int binary_search(int[] arr, int target){
        int start = 0, end= arr.length-1, mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
