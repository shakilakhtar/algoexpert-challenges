package com.challenge.algoexpert.famousalgorithms;

import java.util.*;

public class TopologicalSort {

    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        Map<Integer,List<Integer>> map  =  new HashMap<>();
        int[] indegree;
        if (jobs.get(0) !=0){
            indegree = new int[jobs.size() + 1];
        }else {
            indegree = new int[jobs.size()];
        }
        //create graph
        for (Integer[] dep: deps) {
            map.computeIfAbsent(dep[1], x-> new ArrayList<>()).add(dep[0]);
            indegree[dep[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (jobs.get(0) != 0 && i == 0){
                continue;
            }
            if (indegree[i] == 0){
                queue.offer(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()){
            Integer current = queue.poll();
            System.out.println(current);
            count++;
            result.add(current);

            for (Integer next: map.getOrDefault(current, new ArrayList<>())) {
                if (--indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        Collections.reverse(result);
        return count == jobs.size() ? result : new ArrayList<>();
    }
}
