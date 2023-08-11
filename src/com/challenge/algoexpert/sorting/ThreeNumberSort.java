package com.challenge.algoexpert.sorting;

public class ThreeNumberSort {
    public int[] threeNumberSort(int[] array, int[] order) {
        int currentIdxToBeSorted = 0;
        for(int currentNumberInOrder : order){
            for (int i = currentIdxToBeSorted + 1; i < array.length; i++) {
                if (array[currentIdxToBeSorted] == currentNumberInOrder){
                    currentIdxToBeSorted += 1;
                }else if (currentNumberInOrder == array[i]){
                    swap(array, currentIdxToBeSorted, i);
                    currentIdxToBeSorted += 1;
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
