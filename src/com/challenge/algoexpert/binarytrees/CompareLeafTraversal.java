package com.challenge.algoexpert.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class CompareLeafTraversal {
    public boolean compareLeafTraversal(BinaryTree tree1, BinaryTree tree2) {
        Queue<BinaryTree> queue1 = leafTraversal(tree1,new LinkedList<>());
        Queue<BinaryTree> queue2 = leafTraversal(tree2,new LinkedList<>());
        if (queue1.size() != queue2.size()) return false;

        while (!queue1.isEmpty() && !queue2.isEmpty()){
            BinaryTree node1 = queue1.poll();
            BinaryTree node2 = queue2.poll();
            if (node1.value != node2.value) return false;
        }
        return true;
    }

    public Queue<BinaryTree> leafTraversal(BinaryTree root, Queue<BinaryTree> queue){
        if (root == null) return queue;
        leafTraversal(root.left, queue);
        if (root.left == null && root.right == null){
            queue.add(root);
        }
        leafTraversal(root.right, queue);
        return queue;
    }
}
