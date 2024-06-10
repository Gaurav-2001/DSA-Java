package com.LogicBuilding.Recursion;
// bubble sort using recursion.
import java.util.Arrays;

public class Prg16 {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1};
        System.out.print(Arrays.toString(bubbleSort(arr, arr.length, 0)));
    }
    private static int[] bubbleSort(int[] arr, int row, int columns){
        if (row==0){
            return arr;
        }
        if (columns<row-1)
        {
            if(arr[columns]>arr[columns+1]){
                int temp = arr[columns];
                arr[columns] = arr[columns+1];
                arr[columns+1] = temp;
            }
            return bubbleSort(arr, row, columns+1);
        }
        else
            return bubbleSort(arr, row-1, 0);
    }
}
