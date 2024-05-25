package com.LeetCode.Easy;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Prg1295 {
    public static void main(String[] args) {
        System.out.print(Math.log10(456)+1);
    }
    public int findNumbersOptimum(int[] nums){
        int count=0,digit=0;
        for(int i=0;i<nums.length;i++){
            count = ((int)Math.log10(nums[i])+1)%2==0?count+1:count;
        }
        return count;
    }
        public int findNumbers(int[] nums) {
            int count=0,digit=0;
            for(int i=0;i<nums.length;i++){
                int n=nums[i];
                digit=0;
                if(n==0){
                    digit=1;
                }
                while(n!=0){
                    n=n/10;
                    digit++;
                }
                count=(digit%2==0?count+1:count);
            }
            return count;
        }

}
