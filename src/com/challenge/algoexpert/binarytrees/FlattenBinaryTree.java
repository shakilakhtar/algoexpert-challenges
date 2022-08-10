package com.challenge.algoexpert.binarytrees;

public class FlattenBinaryTree {
    public static BinaryTree flattenBinaryTree(BinaryTree root) {
        Holder holder = new Holder();
        convertToDLL(root,holder);
        return holder.head;
    }

    public static void convertToDLL(BinaryTree root,Holder holder){
        if(root==null){
            return;
        }
        convertToDLL(root.left,holder);
        if (holder.head==null){
            holder.head=root;
        }else {
            root.left = holder.previous;
            holder.previous.right = root;
        }
        holder.previous = root;
        convertToDLL(root.right,holder);
    }

    private static class Holder{
        BinaryTree previous;
        BinaryTree head;
    }
}
