package com.LeetCode.Easy;
//https://leetcode.com/problems/finding-3-digit-even-numbers/
public class Prg1672 {
    static public int maximumWealth(int[][] accounts) {
        int rich=0;
        for(int i=0;i<accounts.length;i++){
            int temp_rich=0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp_rich = temp_rich + accounts[i][j];
            }
            rich = Math.max(temp_rich, rich);
        }
        return rich;
    }
}
