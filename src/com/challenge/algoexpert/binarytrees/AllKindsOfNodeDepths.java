package com.challenge.algoexpert.binarytrees;

public class AllKindsOfNodeDepths {
    public static int allKindsOfNodeDepths(BinaryTree root) {
        if (root == null) return 0;

        return allKindsOfNodeDepths(root.left) + allKindsOfNodeDepths(root.right) + nodeDepths(root, 0);
    }

    public static int nodeDepths(BinaryTree node, int depth) {
        if (node == null) return 0;
        return depth + nodeDepths(node.left, depth + 1) + nodeDepths(node.right, depth + 1);
    }
}
