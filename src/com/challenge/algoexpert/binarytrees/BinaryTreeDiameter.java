package com.challenge.algoexpert.binarytrees;

public class BinaryTreeDiameter {
    public int binaryTreeDiameter(BinaryTree tree) {
        if(tree==null) return  0;
       int leftHeight =  height(tree.left);
       int rightHeight =  height(tree.right);
       int leftDiameter =  binaryTreeDiameter(tree.left);
       int rightDiameter =  binaryTreeDiameter(tree.right);
       int maxDiameter  =  Math.max(leftDiameter,rightDiameter);
        return Math.max(leftHeight+rightHeight, maxDiameter);
    }

    public int height(BinaryTree root){
        if (root == null) {
            return 0;
        }
        int left  =  height(root.left);
        int right = height(root.right);

        return 1+Math.max(left,right);
    }
}
