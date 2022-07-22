package com.challenge.algoexpert.arrays;

import java.util.HashSet;
import java.util.Set;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> set= new HashSet<>();
        for (int num: array) {
            if (set.contains(targetSum-num)){
                return new int[]{targetSum-num,num};
            }
            else {
                set.add(num);
            }
        }
        return new int[0];
    }
}
