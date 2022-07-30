package com.challenge.algoexpert.bst;

import java.util.ArrayList;
import java.util.List;

public class RightSmallerThan {
    int value;
    RightSmallerThan left;
    RightSmallerThan right;
    int leftNodes;
    public RightSmallerThan(int value) {
        this.value = value;
        this.leftNodes=0;
    }
    public static List<Integer> rightSmallerThan(List<Integer> array) {
        if(array.size() == 0){
            return new ArrayList<Integer>();
        }
        int len = array.size();
        List<Integer> result = new ArrayList<>();
        result.set(len-1,0);
        RightSmallerThan node = new RightSmallerThan(array.get(len-1));
        for (int i=len-2;i>=0;i--){
            node.bstInsert(array.get(i),result,i);
        }
        return result;
    }

    public RightSmallerThan bstInsert(int value, List<Integer> list, int idx){
        RightSmallerThan node = this;
        RightSmallerThan current = new RightSmallerThan(value);
        int smallerNodes = 0;
        while (true){
            if (node.value > value){
                node.leftNodes++;
                if (node.left == null){
                    node.left = current;
                    break;
                }
                node = node.left;
            }else{
                if (node.value < value){
                   smallerNodes++;
                }
                smallerNodes += node.leftNodes;
                if (node.right == null){
                    node.right = current;
                    break;
                }
                node = node.right;
            }
        }
        list.set(idx,smallerNodes);
        return this;
    }

}
