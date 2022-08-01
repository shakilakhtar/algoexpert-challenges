package com.challenge.algoexpert.dp;

public class MaxSubsetSumNoAdjacent {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        if(array.length == 0){
            return 0;
        }
        int second = array[0];
        if(array.length == 1){
            return second;
        }
        int first = Math.max(array[0],array[1]);

        for (int i = 2; i < array.length; i++) {
            int current = Math.max(first, second+array[i]);
            second=first;
            first=current;
        }
        return first;
    }
    // solution complexity is O(n) space complexity O(n)
    public static int maxSubsetSumNoAdjacent1(int[] array) {
        if(array.length == 0){
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        if (array.length == 2){
            return Math.max(array[0],array[1]);
        }
        int[] dp = new int[array.length];
        dp[0] = array[0];
        dp[1] = Math.max(array[0],array[1]);
        for (int i = 2; i < array.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+array[i]);
        }
        return dp[array.length-1];
    }
}
