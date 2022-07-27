package com.challenge.algoexpert.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int leftPtr = 0;
        int rightPtr = array.size()-1;
        while (leftPtr < rightPtr){

            while(leftPtr < rightPtr && array.get(rightPtr) == toMove){
                rightPtr-=1;
            }
            if(array.get(leftPtr) == toMove){
                int rightNum = array.get(rightPtr);
                int leftNum = array.get(leftPtr);
                array.set(rightPtr,leftNum);
                array.set(leftPtr,rightNum);
            }
            leftPtr+=1;
        }
        return array;
    }
}
