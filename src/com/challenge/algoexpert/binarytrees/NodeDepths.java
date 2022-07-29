package com.challenge.algoexpert.binarytrees;

public class NodeDepths {
    private static int depth=0;
    public static int nodeDepths(BinaryTree root) {
        nodeDepth(root,0);
        return depth;
    }

    public static void nodeDepth(BinaryTree root,int level){
        depth+=level;
        if(root.left!=null){
            nodeDepth(root.left,level+1);
        }
        if(root.right!=null){
            nodeDepth(root.right,level+1);
        }
    }
}
