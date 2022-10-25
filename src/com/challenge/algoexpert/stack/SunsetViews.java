package com.challenge.algoexpert.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SunsetViews {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> stack = new Stack<>();
        int idx =  direction.equals("EAST") ? 0 : buildings.length - 1;
        int step = direction.equals("EAST") ? 1 : -1;

        while (idx >= 0 && idx < buildings.length){
            int buildingHeight =  buildings[idx];
            while (!stack.isEmpty() && buildingHeight >= buildings[stack.peek()]){
                     stack.pop();
            }
            stack.push(idx);
            idx += step;
        }
        ArrayList<Integer> result = new ArrayList<Integer>(stack);
        if(direction.equals("WEST")) {
            Collections.reverse(result);
        }
        return result;
    }
}
