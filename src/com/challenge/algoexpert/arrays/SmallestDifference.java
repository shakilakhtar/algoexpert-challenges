package com.challenge.algoexpert.arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idx1 = 0;
        int idx2 = 0;
        int smallest = Integer.MAX_VALUE;
        int current;
        int[] smallestPair = new int[2];
        while(idx1 < arrayOne.length && idx2 < arrayTwo.length){
            int firstNum = arrayOne[idx1];
            int secondNum = arrayTwo[idx2];
            if(firstNum < secondNum){
                current = secondNum - firstNum;
                idx1+=1;
            }else if(secondNum < firstNum){
                current = firstNum - secondNum;
                idx2+=1;
            }
            else{
                return new int[]{firstNum,secondNum};
            }
            if(Math.abs(smallest) > current){
                smallest = Math.abs(current);
                smallestPair[0] = firstNum;
                smallestPair[1] = secondNum;
            }
        }
        return smallestPair;
    }
}
