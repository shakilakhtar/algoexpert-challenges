package com.challenge.algoexpert.tries;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    boolean endOfWord;
    Map<Character, Trie> nodes;

    public Trie(){
        this.endOfWord = false;
        this.nodes = new HashMap<>();
    }

    public Trie insertIntoTrie(Trie root, String word){
        Trie temp = root;
        for (char ch: word.toCharArray()){
            if (!temp.nodes.containsKey(ch)){
                Trie node = new Trie();
                temp.nodes.put(ch, node);
                temp = node;
            }
            else {
                temp =  temp.nodes.get(ch);
            }
        }
        temp.endOfWord = true;
        return root;
    }
    public void traverseTrie(Trie root, String word){
        if (root.endOfWord){
            return;
        }
        for (Map.Entry<Character,Trie> node: root.nodes.entrySet()) {
            traverseTrie(node.getValue(), word+String.valueOf(node.getKey()));
        }
    }

    public boolean searchInTrie(Trie root, String word){
        if (word.length() == 0){
            return true;
        }
        char firstChar = word.charAt(0);
        if (root.nodes.containsKey(firstChar)){
            Trie nextNode =  root.nodes.get(firstChar);
            return searchInTrie(nextNode, word.substring(1));
        }
        return false;
    }
}
