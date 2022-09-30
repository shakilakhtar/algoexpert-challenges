package com.challenge.algoexpert.searching;

public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
           if (array[i] > third){
               first = second;
               second = third;
               third = array[i];
           } else if ( second < array[i]) {
               first = second;
               second = array[i];
           }
           else if ( first < array[i]) {
               first = array[i];
           }else {

           }
        }
        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        int[]a = new int[]{141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] result = findThreeLargestNumbers(a);
        System.out.print( result[0]+" " +result[1]+" "+result[2]);
    }
}
