package com.challenge.algoexpert.greedyalgoriths;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class TaskAssignment {
    public static ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        PriorityQueue<Integer> minHeap =  new PriorityQueue<>((a,b)->tasks.get(a) - tasks.get(b));
        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>((a,b)-> tasks.get(b) - tasks.get(a));

        for (int i = 0; i < tasks.size(); i++) {
            minHeap.add(i);
            maxHeap.add(i);
            if (i >= k){
                minHeap.poll();
                maxHeap.poll();
            }
        }

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> taskPair = new ArrayList<>();
            taskPair.add(minHeap.poll());
            taskPair.add(maxHeap.poll());

            pairs.add(taskPair);
        }
        return pairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tasks = new ArrayList<>();
        tasks.add(1);
        tasks.add(3);
        tasks.add(5);
        tasks.add(3);
        tasks.add(1);
        tasks.add(4);

        taskAssignment(3,tasks);
    }
}
