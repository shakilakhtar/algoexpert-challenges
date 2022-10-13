package com.challenge.algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

    public static int productSum(List<Object> array) {
        // Write your code here.
        return productSum(array, 1);
    }
    public static int productSum(List<Object> array, int depth){
        int sum = 0;
        for (Object obj: array) {
            if(obj instanceof ArrayList){
                sum += productSum((ArrayList<Object>)obj, depth+1);
            }else {
                sum += (int)obj;
            }
        }

        return sum * depth;
    }
}
