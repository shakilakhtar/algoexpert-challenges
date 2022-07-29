package com.challenge.algoexpert.binarytrees;

public class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;
    public BinaryTree parent = null;


    BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
