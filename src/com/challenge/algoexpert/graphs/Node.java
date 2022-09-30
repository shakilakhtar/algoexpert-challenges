package com.challenge.algoexpert.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
        this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
        array.add(name);
        children.forEach(child-> child.depthFirstSearch(array));
        return array;
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }
}


