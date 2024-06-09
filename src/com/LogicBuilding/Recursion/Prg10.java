package com.LogicBuilding.Recursion;
//Count number of zeros in a number
public class Prg10 {
    static int ans =0;
    public static void main(String[] args) {
        System.out.print(count_zeros(30020));
    }
    private static int count_zeros(int n){
        if(n==0)
            return ans;
        if (n%10==0){
            ans++;
        }
        return count_zeros(n/10);
    }
}
