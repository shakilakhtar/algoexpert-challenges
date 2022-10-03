package com.challenge.algoexpert.linkedlist;

public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList current  = head;
        LinkedList previous =null;
        while (current!=null){
            LinkedList temp = current.next;
            current.next = previous;
            previous =current;
            current =temp;
        }
        return previous;
    }

}
