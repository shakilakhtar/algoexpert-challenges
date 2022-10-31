package com.challenge.algoexpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> riverSizes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    continue;
                }
                riverSizes.add(getSizeDfs(0, i, j, matrix));
            }
        }
        return riverSizes;
    }

    private static int getSizeDfs(int size, int i, int j , int[][] matrix){
        if (i < 0 || j < 0 || i == matrix.length || j == matrix[0].length){
            return 0;
        }
        if (matrix[i][j] == 0){
            return 0;
        }
        // set to zero means visited node( matrix element )
        matrix[i][j] = 0;
        //visit right matrix element
        int right =  getSizeDfs(size, i , j + 1, matrix);
        //visit bottom matrix element
        int bottom =  getSizeDfs(size, i+1 , j, matrix);
        //visit left matrix element
        int left =  getSizeDfs(size, i , j - 1, matrix);
        //visit top matrix element
        int top =  getSizeDfs(size, i - 1 , j, matrix);

        // sum all sizes and add 1 for current element
        size += right;
        size += bottom;
        size += left;
        size += top;

        size++;

        return size;
    }
}
