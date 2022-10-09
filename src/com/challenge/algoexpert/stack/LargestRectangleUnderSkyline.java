package com.challenge.algoexpert.stack;

import java.util.ArrayList;
import java.util.Stack;

public class LargestRectangleUnderSkyline {
    public int largestRectangleUnderSkyline(ArrayList<Integer> buildings) {
        int h = buildings.size();
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <=h; i++) {
            int currentHeight = i == h ? 0 : buildings.get(i);
            while (!stack.isEmpty() && currentHeight < buildings.get(stack.peek())){
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek()-1;
                int area = buildings.get(top) * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
