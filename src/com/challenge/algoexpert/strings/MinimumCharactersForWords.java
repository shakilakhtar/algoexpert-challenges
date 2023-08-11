package com.challenge.algoexpert.strings;

public class MinimumCharactersForWords {
    public static char[] minimumCharactersForWords(String[] words) {
        int[] hash = new int[255];
        StringBuilder sb = new StringBuilder();
        for (String word: words) {
            int[] tempHash =  new int[255];
            for (char ch: word.toCharArray()){
                tempHash[ch]++;
                if (tempHash[ch] > hash[ch]){
                    sb.append(ch);
                    hash[ch] = tempHash[ch];
                }
            }
        }
        return sb.toString().toCharArray();
    }

    public static void main(String[] args) {
        String[] words = new String[]{"a", "abc", "ab", "boo"};
        char[] ch = minimumCharactersForWords(words);
    }
}
