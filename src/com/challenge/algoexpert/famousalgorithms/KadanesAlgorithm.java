package com.challenge.algoexpert.famousalgorithms;

public class KadanesAlgorithm {

    public static int kadanesAlgorithm(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];
        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i],currentSum+array[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
