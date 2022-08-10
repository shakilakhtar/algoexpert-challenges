package com.challenge.algoexpert.bst;

import java.util.ArrayList;
import java.util.List;

public class SameBsts {

    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        if (arrayOne.size()==0 && arrayTwo.size()==0){
            return true;
        }
        if (arrayOne.size()!=arrayTwo.size()){
            return false;
        }
        int arrayOneRoot = arrayOne.remove(0);
        int arrayTwoRoot = arrayTwo.remove(0);
        if (arrayOneRoot!=arrayTwoRoot){
            return false;
        }

        List<Integer> leftSubtreeOne = getSmaller(arrayOne,arrayOneRoot);
        List<Integer> leftSubtreeTwo = getSmaller(arrayTwo,arrayTwoRoot);
        List<Integer> rightSubtreeOne = getBiggerOrEqual(arrayOne,arrayOneRoot);
        List<Integer> rightSubtreeTwo = getBiggerOrEqual(arrayTwo,arrayTwoRoot);


        return sameBsts(leftSubtreeOne,leftSubtreeTwo) && sameBsts(rightSubtreeOne,rightSubtreeTwo);
    }

    public static List<Integer> getSmaller(List<Integer> array, int root){
        List<Integer> smaller = new ArrayList<>();
        for (Integer num:array) {
            if(num < root){
                smaller.add(num);
            }
        }
        return smaller;
    }

    public static List<Integer> getBiggerOrEqual(List<Integer> array, int root){
        List<Integer> biggerOrEqual = new ArrayList<>();
        for (Integer num:array) {
            if(num >= root){
                biggerOrEqual.add(num);
            }
        }
        return biggerOrEqual;
    }
}
