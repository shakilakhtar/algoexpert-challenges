package com.challenge.algoexpert.sorting;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        mergeSort(array,0, array.length-1);
        return array;
    }

    public static void mergeSort(int[] array, int left, int right){
        if (right > left){
            int mid = left + (right - left)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            //merge function
            merge(array,left,mid,right);
        }

    }

    public static void merge(int[] array, int low, int mid, int high){
        int n1 = mid -low +1;
        int n2 = high -mid;
        int[] left = new int[n1];
        int[] right  = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = array[low + i];
        }

        for (int j = 0; j < n2; j++) {
            right[j] = array[mid + 1 +j];
        }

        int i=0,j=0,k=low;
        while (i < n1 && j < n2){
            if (left[i] <= right[j]){
                array[k] = left[i];
                i++;
                k++;
            }else {
                array[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < n1){
            array[k]=left[i];
            i++;
            k++;
        }
        while (j < n2){
            array[k]=right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{10,5,30,15,7};
        int l=0,r=4;

        mergeSort(a,l,r);
        for(int x: a)
            System.out.print(x+" ");
    }
}
