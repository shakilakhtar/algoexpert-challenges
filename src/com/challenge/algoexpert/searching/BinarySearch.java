package com.challenge.algoexpert.searching;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {

        return search(array,0,array.length-1,target);
    }

    public static int search(int[] array, int start, int end, int target){
        //base case
        if(start > end){
           return -1;
        }
        int mid  =  (start+end)/2;
        if(array[mid] == target){
            return mid;
        }
        if(target > array[mid]){
            return search(array,mid+1, end, target);
        }else {
            return search(array,start, mid-1, target);
        }
    }
}
