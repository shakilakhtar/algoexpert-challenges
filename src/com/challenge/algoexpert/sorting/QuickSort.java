package com.challenge.algoexpert.sorting;

public class QuickSort {
    public static int[] quickSort(int[] array) {
        sort(array,0, array.length-1);
        return array;
    }

    public static void sort(int[] array, int start, int end){
        if (start >= end){
            return;
        }
        int pivot = partition(array, start, end);
        sort(array,start,pivot-1);
        sort(array,pivot+1,end);
    }

    public static int partition(int[] array, int start, int end){
        //find position for pivot
        int i = start;
        int pivot = array[end];
        for (int j = start; j <= end; j++) {
            if (array[j] < pivot){
                swap(array, i, j);
                i++;
            }
        }
        // place pivot and swap last with the position
        swap(array, i, end);

        return i;
    }
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,4,5,7};
        quickSort(a);
        for (int i: a) {
            System.out.print(i +" ");
        }
    }
}
