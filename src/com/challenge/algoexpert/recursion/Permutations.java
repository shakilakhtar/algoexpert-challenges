package com.challenge.algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        if (array.size() == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> permutations = new ArrayList<>();
        permutationHelper(array,0,permutations);
        return permutations;
    }

    public static void permutationHelper(List<Integer> array, int index, List<List<Integer>> permutations) {
        if (index == array.size() - 1){
            List<Integer> permutation = new ArrayList<>(array);
            permutations.add(permutation);
        }else {
            for (int j = index; j < array.size(); j++) {
                swap(array, index, j);
                permutationHelper(array, index + 1, permutations);
                swap(array, index, j);
            }
        }
//        return;
    }

    private static void swap(List<Integer> array, int i , int j){
        int temp  = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
}
