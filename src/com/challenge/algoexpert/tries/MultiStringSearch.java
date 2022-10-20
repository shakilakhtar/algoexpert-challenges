package com.challenge.algoexpert.tries;

import java.util.ArrayList;
import java.util.List;

public class MultiStringSearch {
    public static List<Boolean> multiStringSearch(String bigString, String[] smallStrings) {
        List<Boolean> result = new ArrayList<>();

        Trie root = new Trie();
        //insert all the words and its substring in the trie
        String[] tokens = bigString.split(" ");
        for (String word: tokens) {
            for (int i = 0; i < word.length(); i++) {
                root = root.insertIntoTrie(root, word.substring(i));
            }
        }
        root.traverseTrie(root, "");

        for (String wordToCheck: smallStrings) {
           result.add(root.searchInTrie(root, wordToCheck));
        }
        return result;
    }
}
