package com.challenge.algoexpert.searching;

public class SearchInSortedMatrix {
    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length -1;
        while (row < matrix.length && col >= 0){
           if (matrix[row][col] > target){
               col = col - 1;
           } else if (matrix[row][col] < target) {
               row = row + 1;
           }
           else {
               return new int[]{row,col};
           }

        }
        return new int[] {-1, -1};
    }
}
