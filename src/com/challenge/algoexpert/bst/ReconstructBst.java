package com.challenge.algoexpert.bst;

import java.util.ArrayList;
import java.util.List;

public class ReconstructBst {
    int currentIdx;
    public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
        currentIdx = 0;
        return bstFromPreorder(preOrderTraversalValues, Integer.MAX_VALUE);
    }

    public  BST bstFromPreorder(ArrayList<Integer> preOrder, int upperBound){
        if (currentIdx == preOrder.size() || preOrder.get(currentIdx) >= upperBound){
            return null;
        }
        BST root =  new BST(preOrder.get(currentIdx));
        currentIdx++;
        root.left = bstFromPreorder(preOrder,root.value);
        root.right = bstFromPreorder(preOrder,upperBound);
        return root;
    }
}
