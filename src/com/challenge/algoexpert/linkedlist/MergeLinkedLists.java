package com.challenge.algoexpert.linkedlist;

public class MergeLinkedLists {

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {
        LinkedList dummy = new LinkedList(0);
        LinkedList currentNode = dummy;

        while (headOne != null && headTwo != null){
            if (headOne.value < headTwo.value){
                currentNode.next = headOne;
                headOne = headOne.next;
            }else {
                currentNode.next = headTwo;
                headTwo = headTwo.next;
            }
            currentNode = currentNode.next;
        }
        if (headOne != null){
            currentNode.next = headOne;
            headOne = headOne.next;
        }
        if (headTwo != null){
            currentNode.next = headTwo;
            headTwo = headTwo.next;
        }
        return dummy.next;
    }
}
