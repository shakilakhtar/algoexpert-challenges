package com.challenge.algoexpert.binarytrees;

public class MaxPathSumInBinaryTree {
    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(BinaryTree tree) {
        postOrder(tree);
        return max;
    }
    public static int postOrder(BinaryTree tree){
        if (tree==null){
            return 0;
        }
        int leftMax = Math.max(postOrder(tree.left),0);
        int rightMax = Math.max(postOrder(tree.right),0);
        max = Math.max(max, leftMax+rightMax+tree.value);

        return Math.max(leftMax,rightMax)+tree.value;
    }
}
