package com.challenge.algoexpert.dp;

import java.util.Map;

public class MinNumberOfJumps {
    public static int minNumberOfJumps(int[] array) {
        int result = 0;
        int left =0;
        int right = 0;
        while (right < array.length - 1){
            int furthest = 0;
            for (int i = left; i <= right; i++) {
                furthest = Math.max(furthest, i + array[i]);
            }
            left = right + 1;
            right = furthest;
            result++;
        }
        return result;
    }
}
