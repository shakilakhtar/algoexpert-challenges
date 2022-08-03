package com.challenge.algoexpert.bst;

import java.util.Arrays;
import java.util.List;

public class MinHeightBst {

    public static BST minHeightBst(List<Integer> array) {
        if (array.size()==0){
            return null;
        }
        int mid = array.size()/2;
        BST root = new BST(array.get(mid));
        constructBSTFromArray(root,array,0,mid-1);
        constructBSTFromArray(root,array,mid+1,array.size()-1);
        return root;
    }

    public static void constructBSTFromArray(BST root, List<Integer> array, int left, int right){
        if (left > right){
            return;
        }
        int midpoint =  (left+right)/2;
        //call bst insert method given in the BST class
       // root.insert(array.get(midpoint));
        constructBSTFromArray(root,array,left,midpoint-1);
        constructBSTFromArray(root,array,midpoint+1,right);

    }
}
