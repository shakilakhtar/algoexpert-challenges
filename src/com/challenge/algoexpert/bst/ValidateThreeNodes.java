package com.challenge.algoexpert.bst;

public class ValidateThreeNodes {

    public boolean validateThreeNodes(BST nodeOne, BST nodeTwo, BST nodeThree) {
       boolean foundTwo = false;
       BST node = nodeOne;
       while (node != null){
           if (nodeTwo.value == node.value){
               foundTwo = true;
           }
           if (nodeThree.value < node.value){
               node = node.left;
           }else if(nodeThree.value > node.value){
               node = node.right;
           }else {
               if(foundTwo){
                   return true;
               }
               break;
           }
       }
       foundTwo = false;
       node = nodeThree;
       while (node != null){
           if (nodeTwo.value == node.value){
               foundTwo = true;
           }
           if (nodeOne.value < node.value){
               node = node.left;
           }
           else if (nodeOne.value > node.value){
               node = node.right;
           }else{
               return foundTwo;
           }
       }
        return false;
    }
}
