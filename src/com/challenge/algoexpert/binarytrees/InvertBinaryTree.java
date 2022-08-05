package com.challenge.algoexpert.binarytrees;

public class InvertBinaryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        BinaryTree right = invertTree(tree.right);
        BinaryTree left = invertTree(tree.left);
        tree.right=left;
        tree.left=right;
    }

    public static BinaryTree invertTree(BinaryTree root){
        if (root==null){
            return null;
        }
        BinaryTree right  = invertTree(root.right);
        BinaryTree left  = invertTree(root.left);
        root.right = left;
        root.left = right;
        return root;
    }
}
