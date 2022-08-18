package com.challenge.algoexpert.bst;

public class BSTConstruct {
    public int value;
    public BST left;
    public BST right;

    public BSTConstruct(int value) {
        this.value = value;
    }
//    public BST insert(int value) {
//        insertHelper(this,value);
//        // Do not edit the return statement of this method.
//        return this;
//    }
    public BST insertHelper(BST tree, int value) {
        if (tree == null) {
            return new BST(value);
        }
        if (value < tree.value) {
            tree.left = insertHelper(tree.left,value);
        }else{
            tree.right = insertHelper(tree.right,value);
        }
        return tree;
    }
//    public boolean contains(int value) {
//        return containsHelper(this,value);
//    }

    public boolean containsHelper(BST tree,int value) {
        if (tree == null) {
            return false;
        }
        if(tree.value==value){
            return  true;
        } else if (value < tree.value) {
            return  containsHelper(tree.left,value);
        }else{
            return containsHelper(tree.right,value);
        }
    }

//    public BST remove(int value) {
//        removeHelper(this,value);
//        // Do not edit the return statement of this method.
//        return this;
//    }

    public BST removeHelper(BST tree,int value) {
        if(tree==null){
            return tree;
        }
        if(value < tree.value){
            tree.left = removeHelper(tree.left,value);
        } else if (value > tree.value) {
            tree.right = removeHelper(tree.right,value);
        }else {
            //if it has no children delete the node
            if(tree.left ==null && tree.right == null){
                return null;
            }
            //if it has only one child replace it with the child
            if(tree.left !=null && tree.right == null){
                tree.value = tree.left.value;
                tree.right = tree.left.right;
                tree.left = tree.left.left;
                return tree;
            }
            if(tree.left ==null && tree.right != null){
                tree.value = tree.right.value;
                tree.left = tree.right.left;
                tree.right = tree.right.right;
                return tree;
            }
            //if it has  two children replace with the smallest value in the right side of tree
            if(tree.left !=null && tree.right != null){
                int smallestValue = smallestValue(tree.right);
                tree.value = smallestValue;
                tree.right = removeHelper(tree.right,smallestValue);
                return tree;
            }
        }
        // Do not edit the return statement of this method.
        return tree;
    }

    public int smallestValue(BST tree){
        return tree.left==null ? tree.value:smallestValue(tree.left);
    }
}
