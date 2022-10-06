package com.challenge.algoexpert.stack;

import java.util.Stack;

public class MinMaxStack {
    //Taking an array that has
    //a[0]= value ; a[1]= min; a[2]= max pointing

    private Stack<int[]> minMaxStack;

    public MinMaxStack(){
        minMaxStack = new Stack<>();
    }
    public int peek() {
        return minMaxStack.peek()[0];
    }

    public int pop() {
        return minMaxStack.pop()[0];
    }

    public void push(Integer number) {
        if (minMaxStack.isEmpty()){
            minMaxStack.push(new int[]{number, number, number});
        }else {
            int max =  Math.max(number, minMaxStack.peek()[2]);
            int min  = Math.min(number, minMaxStack.peek()[1]);
            minMaxStack.push(new int[]{number, min, max});
        }
    }

    public int getMin() {
        return minMaxStack.peek()[1];
    }

    public int getMax() {
        return minMaxStack.peek()[2];
    }
}
