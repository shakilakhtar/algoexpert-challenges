package com.challenge.algoexpert.linkedlist;

public class SumOfLinkedList {

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList dummy = new LinkedList(0);
        LinkedList temp  = dummy;
        int carry = 0;
        while (linkedListOne!=null || linkedListTwo!=null || carry == 1){
            int sum = 0;
            if (linkedListOne != null){
                sum+=linkedListOne.value;
                linkedListOne = linkedListOne.next;
            }
            if (linkedListTwo != null){
                sum+=linkedListTwo.value;
                linkedListTwo = linkedListTwo.next;
            }
            sum += carry;
            carry = sum / 10;
            LinkedList node = new LinkedList(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
