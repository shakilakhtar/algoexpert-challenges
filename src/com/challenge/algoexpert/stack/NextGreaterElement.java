package com.challenge.algoexpert.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] array) {
        Stack<Integer> stack =  new Stack<>();
        int[] result  = new int[array.length];
        Arrays.fill(result,-1);
        for (int i = 2*array.length - 1; i >=0; i--) {
            int circularIdx = i % array.length;
            while (!stack.isEmpty()){
                    if (array[circularIdx] >= array[stack.peek()]){
                        stack.pop();
                    }else {
                        //set next greater element
                        result[circularIdx] = array[stack.peek()];
                        break;
                    }
                }
            stack.push(circularIdx);
        }

        return result;
    }
}
