package com.challenge.algoexpert.recursion;

public class StaircaseTraversal {

    public int staircaseTraversal(int height, int maxSteps) {
        Integer[] memo = new Integer[height + 1];

        return findWays(height, maxSteps);
    }

    //Bottom up approach
    public int findWays(int height, int maxSteps){
        int[] dp = new int[height + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            int step = 1;
            while (step <= maxSteps && i - step >= 0){
                dp[i] += dp[i - step];
                step++;
            }
        }

        return dp[dp.length - 1];
    }

    //top down with memo table
    public int findWays(int height, int maxSteps, Integer[] memo){
        if (height == 0){
            return 1;
        }
        if (memo[height]!= null) return memo[height];
        int result = 0;
        for (int i = 1; i <= maxSteps; i++) {
            result += findWays(height - i, maxSteps, memo);
            memo[height] = result;
        }

        return result;
    }
}
