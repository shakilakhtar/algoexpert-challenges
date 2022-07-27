package com.challenge.algoexpert.arrays;

import java.util.List;

public class ValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if(sequence.size()==0){
            return false;
        }
        int index =0;
        for (int i=0;i<array.size();i++){
            if(array.get(i)==sequence.get(index)){
                index++;
            }
            if(index==sequence.size()){
                return true;
            }
        }

        return false;
    }
}
