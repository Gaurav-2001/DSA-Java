package com.LogicBuilding.Recursion;
//Tell if the array is sorted or not.
public class Prg11 {
    public static void main(String[] args) {
        System.out.print(isAscending(new int[]{1, 2, 3, 5, 8, 9},0));
    }
    private static boolean isAscending(int[] arr,int index){
        if (index == arr.length-1)
            return true;
        if (arr[index]<=arr[index+1]){
            return isAscending(arr, index + 1);
        }
        return false;
    }
}
