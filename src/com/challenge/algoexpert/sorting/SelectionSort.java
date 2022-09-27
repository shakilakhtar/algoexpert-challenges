package com.challenge.algoexpert.sorting;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int ptr =0;
        while (ptr < array.length) {
            for (int j = ptr+1; j < array.length; j++) {
                if (array[j] < array[ptr]){
                    int temp = array[j];
                    array[j] = array[ptr];
                    array[ptr]  =temp;
                }
            }
            ptr++;
        }
        return array;
    }
}
