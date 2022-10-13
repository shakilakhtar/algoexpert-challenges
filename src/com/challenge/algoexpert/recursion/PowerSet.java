package com.challenge.algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> powersets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        powersetHelper(array, subset, 0, powersets);
        return powersets;
    }

    public static void powersetHelper(List<Integer> array, List<Integer> subset, int index, List<List<Integer>> powersets){
        powersets.add(new ArrayList<>(subset));
        //base case
        if (subset.size() == array.size()){
            return;
        }
        for (int i = index; i < array.size(); i++) {
            subset.add(array.get(i));
            powersetHelper(array, subset, i + 1, powersets);
            subset.remove(subset.size() - 1);
        }
    }
}
