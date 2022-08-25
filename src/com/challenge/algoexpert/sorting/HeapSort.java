package com.challenge.algoexpert.sorting;

public class HeapSort {

    public static int[] heapSort(int[] array) {
        if (array.length <=1){
            return array;
        }
        sort(array);
        return array;
    }

    public static void  buildHeap(int[] array, int n){
        for (int i = n/2-1; i >= 0; i--) {
            heapify(array, n, i);
        }
    }

    public static void sort(int[] array){
        int n = array.length;
        buildHeap(array,n);

        for (int i = n-1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }
    public static void heapify(int[] array, int n, int idx){
        int largest = idx;
        int l =  2*idx +1;
        int r = 2*idx+2;

        if (l < n && array[l] > array[largest]){
            largest = l;
        }
        if (r < n && array[r] > array[largest]){
            largest = r;
        }

        if (largest != idx){
            int swap = array[idx];
            array[idx] = array[largest];
            array[largest] = swap;

            heapify(array,n,largest);
        }
    }
}
