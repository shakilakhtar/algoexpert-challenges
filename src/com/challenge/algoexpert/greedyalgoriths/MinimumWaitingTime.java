package com.challenge.algoexpert.greedyalgoriths;

import java.util.Arrays;

public class MinimumWaitingTime {
    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int totalWaitTime = 0;
        int len = queries.length;
        for (int i = 0; i < queries.length; i++) {
            int queriesLeft = len - (i+1);
            totalWaitTime +=  queriesLeft* queries[i];
        }
        return totalWaitTime;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 2, 6};
        int t = minimumWaitingTime(a);
        System.out.println(t);
    }
}
