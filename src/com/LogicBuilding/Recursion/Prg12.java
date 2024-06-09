package com.LogicBuilding.Recursion;
//Linear Search Using recursion
public class Prg12 {
    public static void main(String[] args) {
        System.out.print(linearSearch(new int[]{1, 2, 3, 5, 8, 9},-5,0));
    }
    private static int linearSearch(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (target == arr[index]){
            return index;
        }
        else {
            return linearSearch(arr,target,index+1);
        }
    }
}
