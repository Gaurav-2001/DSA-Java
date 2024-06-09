package com.LogicBuilding.Recursion;
// sorting using recursion
import java.util.Arrays;

public class Prg04 {
    public static void main(String[] args) {
        int[] arr = {-5,3,2,4,1,0};
        sort(arr, arr.length-1);
        System.out.printf(Arrays.toString(arr));
    }
    private static void sort(int[] arr, int last_index){
        if (last_index>=1) {
            int big=0,temp;
            for (int i = 0; i <= last_index; i++) {
                if(arr[big]<=arr[i]) {
                    big = i;
                }
            }
            temp = arr[big];
            arr[big] = arr[last_index];
            arr[last_index] = temp;
            sort(arr,last_index-1);
        }
    }
}
