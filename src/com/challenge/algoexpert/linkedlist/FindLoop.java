package com.challenge.algoexpert.linkedlist;

public class FindLoop {

    public static LinkedList findLoop(LinkedList head) {
        LinkedList node = head;
        while(node!=null){
            if (node.seen){
                return node;
            }
            node.seen =true;
            node=node.next;
        }
        return null;
    }
}
