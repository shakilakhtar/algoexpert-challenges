package com.challenge.algoexpert.dp;

import java.util.Arrays;

public class MinNumberOfCoinsForChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for(int j = 0; j < denoms.length; j++){
            for(int i = 0; i <= n; i++){
                if(i - denoms[j] >= 0){
                    dp[i] = Math.min(dp[i], dp[i - denoms[j]] + 1);
                }
            }
        }
        return dp[n] > n ? -1 : dp[n];
    }
}
