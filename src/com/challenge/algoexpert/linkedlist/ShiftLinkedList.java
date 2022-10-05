package com.challenge.algoexpert.linkedlist;

public class ShiftLinkedList {
    public static LinkedList shiftLinkedList(LinkedList head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        LinkedList dummy = head;
        int length = 1;
        while (dummy.next != null){
            length++;
            dummy = dummy.next;
        }
        int normK = k % length;
        if (normK == 0){
            return head;
        }
        //make LL loop connect end to head
        dummy.next = head;

        LinkedList newHead = null;
        int newEndIndex = length - normK;
        for (int i = 0; i <= newEndIndex; i++) {
            if (i ==  newEndIndex){
                //save new head
                newHead = dummy.next;
                //disconnect end from new head
                dummy.next = null;
            }
            dummy =  dummy.next;
        }

        return newHead;
    }
}
