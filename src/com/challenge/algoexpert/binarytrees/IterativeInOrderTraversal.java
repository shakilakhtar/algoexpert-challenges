package com.challenge.algoexpert.binarytrees;

import java.util.Stack;
import java.util.function.Function;

public class IterativeInOrderTraversal {

    public static void iterativeInOrderTraversal(
            BinaryTree tree, Function<BinaryTree, Void> callback) {
        Stack<BinaryTree> stack  = new Stack<>();
        BinaryTree current  = tree;
        while(current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            callback.apply(current);
            current=current.right;
        }
    }
}
