package com.challenge.algoexpert.dp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KnapsackProblem {
    public static List<List<Integer>> knapsackProblem(int[][] items, int capacity) {
        int [][] dp = new int[items.length + 1][capacity + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                int[] knap = items[i -1];
                if (j >= knap[1]){
                    dp[i][j] = Math.max(dp[i -1][j - knap[1]] + knap[0], dp[i -1][j]);
                }else {
                    dp[i][j] = Math.max(dp[i -1][j], dp[i][j]);
                }
            }
        }
        //if value in dp top is same then do not use that weight else use it.

        int l  = dp.length - 1;
        int k  = dp[0].length - 1;
        LinkedList<Integer> list  = new LinkedList();
        while (k != 0){
            if (l <= 0){
                break;
            }
            if (dp[l][k] == dp[l - 1][k]){
                l--;
            }else {
                int[] knap =  items[l - 1];
                list.push(l - 1);
                l--;
                k -= knap[1];
            }
        }

        // Replace the code below.
        List<Integer> totalValue = Arrays.asList(dp[items.length][capacity]);
        List<Integer> finalItems = new ArrayList<>(list);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(totalValue);
        result.add(finalItems);
        return result;
    }
}
