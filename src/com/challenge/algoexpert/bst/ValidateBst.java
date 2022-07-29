package com.challenge.algoexpert.bst;


public class ValidateBst {

    public static boolean validateBst(BST tree) {
        return isBST(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public static  boolean isBST(BST root, Integer min, Integer max){
        if(root==null){
            return true;
        }
        if(min!=null && root.value<min ){
            return false;
        }
        if(max!=null && root.value>=max){
            return false;
        }
        return isBST(root.left,min,root.value) && isBST(root.right,root.value,max);
    }
}
