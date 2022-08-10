package com.challenge.algoexpert.binarytrees;

public class HeightBalancedBinaryTree {
    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        return  (dfs(tree)!= -1);
    }

    public int dfs(BinaryTree tree){
        if(tree==null){
            return 0;
        }
        int leftHeight = dfs(tree.left);
        int rightHeight = dfs(tree.right);
        if (leftHeight == -1 || rightHeight == -1 ||
                Math.abs(leftHeight-rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight,rightHeight) + 1;
    }
}
