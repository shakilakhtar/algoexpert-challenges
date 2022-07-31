package com.challenge.algoexpert.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums =  new ArrayList<>();
        calculateBranchSum(root,0,sums);
        return sums;
    }

   public static void calculateBranchSum(BinaryTree root,int runningSum,List<Integer> sums){
         if(root == null) return;
         int newRunningSum =  runningSum+root.value;
         if(root.left==null && root.right==null) {
             sums.add(newRunningSum);
             return;
         }
     calculateBranchSum(root.left,newRunningSum,sums);
     calculateBranchSum(root.right,newRunningSum,sums);

   }
}
