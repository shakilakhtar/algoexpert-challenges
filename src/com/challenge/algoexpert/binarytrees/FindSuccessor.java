package com.challenge.algoexpert.binarytrees;

public class FindSuccessor {
    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        if (node.right!=null){
            return minimumTree(node.right);
        }
        BinaryTree successor = node.parent;
        while (successor!=null && node == successor.right){
            node=successor;
            successor = successor.parent;
        }
        return successor;
    }

    public BinaryTree minimumTree(BinaryTree tree){
        while (tree.left!=null){
            tree=tree.left;
        }
        return tree;
    }
}
