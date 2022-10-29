package com.challenge.algoexpert.strings;

import java.util.HashMap;
import java.util.Map;

public class GenerateDocument {
    public boolean generateDocument(String characters, String document) {
        Map<Character,Integer> frequencyMap = new HashMap<>();
        for (char c: characters.toCharArray()) {
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }

        for (char c: document.toCharArray()) {
            if (!frequencyMap.containsKey(c) || frequencyMap.get(c) == 0){
                return false;
            }
            frequencyMap.put(c,frequencyMap.get(c) - 1);
        }
        return true;
    }
}
