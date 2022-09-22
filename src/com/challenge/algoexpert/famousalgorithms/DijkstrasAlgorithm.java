package com.challenge.algoexpert.famousalgorithms;

import java.util.*;

public class DijkstrasAlgorithm {

    public int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        int[] result  = new int[edges.length];
        Arrays.fill(result,-1);
        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(o->(o.distance)));
        Set<Integer> visited = new HashSet<>();
        pq.offer(new Pair(start,0));
        result[start] = 0;

        while (visited.size() < edges.length && !pq.isEmpty()){
            Pair nextNode = pq.poll();
            if (visited.contains(nextNode.id)){
                continue;
            }
            visited.add(nextNode.id);
            result[nextNode.id] = nextNode.distance;
            for (int[] edge: edges[nextNode.id]) {
                if (!visited.contains(edge[0])){
                    pq.offer(new Pair(edge[0],edge[1]+ nextNode.distance));
                }
            }
        }
        return result;
    }

    public static class Pair {
     private int id;
     private int distance;

        public Pair(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }
    }
}

