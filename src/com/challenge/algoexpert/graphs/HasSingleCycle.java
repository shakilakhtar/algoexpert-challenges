package com.challenge.algoexpert.graphs;

public class HasSingleCycle {
    public static boolean hasSingleCycle(int[] array) {
        int numOfElementsVisited = 0;
        //we can start index from any position for now considering from 0
        int currentIdx = 0;

        while (numOfElementsVisited < array.length){
            //if we visited elements and come back to start index then has multiple cycle
            if (numOfElementsVisited > 0 && currentIdx == 0){
                return false;
            }
            numOfElementsVisited += 1;
            currentIdx = getNextIdx(currentIdx, array);
        }
        return currentIdx == 0;
    }

    public static int getNextIdx(int currentIdx, int[] array){
        int jump = array[currentIdx];
        int nextIdx = (currentIdx + jump) % array.length;
        return nextIdx >= 0 ? nextIdx : nextIdx + array.length;
    }
}
