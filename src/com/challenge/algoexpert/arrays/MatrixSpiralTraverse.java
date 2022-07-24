package com.challenge.algoexpert.arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        int startRow=0;
        int endRow = array.length-1;
        int startCol= 0;
        int endCol = array[0].length-1;
        List<Integer> result = new ArrayList<>();

        while(startRow <=endRow && startCol <= endCol){
            //left to right traverse
            for (int j=startCol; j<=endCol; j++){
                result.add(array[startRow][j]);
            }
            if (startRow == endRow){
                break;
            }
            //top to down traverse
            for (int i=startRow+1;i<=endRow;i++){
                result.add(array[i][endCol]);
            }
            if (startCol == endCol){
                break;
            }
            //right to left traverse
            for (int j=endCol-1;j>=startCol;j--){
                result.add(array[endRow][j]);
            }
            //down to top traverse
            for(int i=endRow-1;i>=startRow+1;i--){
                result.add(array[i][startCol]);
            }
            startRow+=1;
            endRow-=1;
            startCol+=1;
            endCol-=1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array ={{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {0, 9, 8, 7}};

        List<Integer> result = spiralTraverse(array);
    }
}
