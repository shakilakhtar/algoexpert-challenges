package com.challenge.algoexpert.bst;

public class FindKthLargestValueInBst {
    public int findKthLargestValueInBst(BST tree, int k) {
        if(tree==null){
            return -1;
        }
            findKthLargestValueInBst(tree.right,k);
            k=k-1;
            if(k==0){
                return tree.value;

            }
            findKthLargestValueInBst(tree.left,k);
        return -1;
    }

}
