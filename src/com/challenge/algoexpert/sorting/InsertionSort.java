package com.challenge.algoexpert.sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j=i-1;
            while (j >=0 && array[j] > key){
                    array[j+1] = array[j];
                    j--;
            }
            array[j+1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {8, 5, 2, 9, 5, 6, 3};
        insertionSort(a);
        for (int i: a) {
            System.out.print(i +" ");
        }
    }
}
