package com.challenge.algoexpert.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        Map<String,List<String>> map =  new HashMap<>();
        if(words.size() == 0){
            return new ArrayList<>();
        }
        for(String s: words){
            //sort the string
            int[] count =  new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0; j< 26; j++){
                sb.append(count[j]);
                sb.append("#"); // add seperator for edge case where key might be same
            }
            String key =sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
