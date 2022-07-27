package com.challenge.algoexpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> triplets =  new ArrayList<>();
        for (int i=0;i<array.length-2;i++){
            int leftPtr = i+1;
            int rightPtr = array.length-1;
            while(leftPtr < rightPtr){
                int currentSum = array[i] + array[leftPtr] + array[rightPtr];
                if(currentSum ==targetSum){
                    triplets.add(new Integer[]{array[i],array[leftPtr],array[rightPtr]});
                    leftPtr=leftPtr+1;
                    rightPtr=rightPtr-1;
                } else if (currentSum < targetSum) {
                    leftPtr=leftPtr+1;
                } else if (currentSum > targetSum) {
                    rightPtr=rightPtr-1;
                }
            }
        }
        return triplets;
    }
}
