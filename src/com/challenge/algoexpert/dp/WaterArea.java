package com.challenge.algoexpert.dp;

import java.util.Map;
import java.util.Stack;

public class WaterArea {
    public static int waterArea(int[] heights) {
        int len  = heights.length;
        if (len == 0) return 0;
        Stack<Integer> stack  = new Stack<>();
        int trapWater = 0;
        for (int i = 0; i < len; i++) {
            int val =  heights[i];
            while (!stack.isEmpty() && val >= heights[stack.peek()]){
                //next greater right
                int nextGreaterRight = i;
                int current = heights[stack.peek()];
                stack.pop();
                if (stack.isEmpty()){
                    break;
                }
                int nextGreaterLeft = stack.peek();
                int width =  nextGreaterRight - nextGreaterLeft - 1;
                trapWater += (Math.min(heights[nextGreaterRight], heights[nextGreaterLeft]) -current) * width;
            }
            stack.push(i);
        }

        return trapWater;
    }
}
