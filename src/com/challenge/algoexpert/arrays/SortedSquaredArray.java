package com.challenge.algoexpert.arrays;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray(int[] array) {
        if(array.length==0){
            return new int[] {};
        }
        int len = array.length-1;
        int startPtr = 0;
        int endPtr  = array.length-1;
        int[] sortedSqr = new int[array.length];
        for (int i=0;i<sortedSqr.length;i++){
            int startEle = Math.abs(array[startPtr]);
            int endEle = Math.abs(array[endPtr]);
            if (endEle > startEle) {
                sortedSqr[len-i] = endEle*endEle;
                endPtr--;
            }else{
                sortedSqr[len-i] = startEle*startEle;
                startPtr++;
            }
        }
        return sortedSqr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9};
        int[] sqrd = sortedSquaredArray(array);
    }
}
