package com.challenge.algoexpert.bst;

public class FindClosestValueInBst {
    public static int findClosestValueInBst(BST tree, int target) {
        int closest = tree.value;
        while (tree != null) {
            if (Math.abs(target - closest) > Math.abs(target - tree.value)) {
                closest = tree.value;
            }
            if (target < tree.value) {
                tree = tree.left;
            }else{
                tree = tree.right;
            }
        }
        return closest;
    }
}
