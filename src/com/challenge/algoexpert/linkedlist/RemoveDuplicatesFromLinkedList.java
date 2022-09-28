package com.challenge.algoexpert.linkedlist;

public class RemoveDuplicatesFromLinkedList {

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList temp = linkedList;
        while(temp.next!=null){
            if (temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else {
                temp =temp.next;
            }
        }
        return temp;
    }
}
