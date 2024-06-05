package com.LogicBuilding.Algo;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {95,60,34,23,20,19,10,3,-1,-90};
        int target =  90;
        System.out.print(order_agnostic_bs(arr,target));

    }

    private static int order_agnostic_bs(int[] arr, int target) {
        if(isAsc(arr)){
            return asc_binary_search(arr, target);
        }
        else {
            return dsc_binary_search(arr, target);
        }
    }

    private static int dsc_binary_search(int[] arr, int target) {
        int start = 0, end= arr.length-1, mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid] < target){
                end = mid-1;
            } else if (arr[mid] > target) {
                start = mid+1;
            } else if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    private static int asc_binary_search(int[] arr, int target) {
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

    private static boolean isAsc(int[] arr) {
        return arr[0] <= arr[arr.length - 1];
    }
}
