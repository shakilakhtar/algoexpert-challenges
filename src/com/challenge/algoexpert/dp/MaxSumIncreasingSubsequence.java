package com.challenge.algoexpert.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxSumIncreasingSubsequence {
    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {

        int [] dp = new int[array.length];
        dp= array.clone();
        int [] seq =  new int[array.length];
        Arrays.fill(seq, -1);

        for (int i = 0; i < dp.length; i++){
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i]){
                   if ((array[i] + dp[j]) > dp[i]){
                      dp[i] =  array[i] + dp[j];
                      seq[i] = j;
                   }
                }
            }
          }

        int maxValue  = Integer.MIN_VALUE;
        int idx = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < dp.length; i++) {
           if (dp[i] > maxValue){
               maxValue = dp[i];
               idx = i;
           }
        }
        LinkedList<Integer> seqList = new LinkedList<>();
        while (idx != -1) {
                seqList.push(array[idx]);
                idx = seq[idx];
        }
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Arrays.asList(maxValue));
        answer.add(seqList);

        return answer;
    }
}
