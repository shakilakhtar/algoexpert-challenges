package com.challenge.algoexpert.stack;

import java.util.ArrayList;

public class SortStack {

    public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        if (stack.size() == 0){
            return stack;
        }
        int top = stack.remove(stack.size()-1);
        stack = sortStack(stack);
        insertAtCorrectPosition(stack, top);
        return stack;
    }

    public void insertAtCorrectPosition(ArrayList<Integer> stack, int top){
        if (stack.size() == 0){
            stack.add(top);
            return;
        }
        int currentTop =  stack.get(stack.size() - 1);
        if (currentTop > top){
            stack.remove(stack.size() - 1);
            insertAtCorrectPosition(stack, top);
            stack.add(currentTop);
        }else {
            stack.add(top);
        }
        return;
    }
}
