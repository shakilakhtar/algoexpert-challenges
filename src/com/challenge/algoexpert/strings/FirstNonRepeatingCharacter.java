package com.challenge.algoexpert.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c: string.toCharArray()) {
            map.put(c,  1+map.getOrDefault(c,0));
        }
        //find first non repeating character
        int idx = -1;
        for (int i=0; i< string.length(); i++) {
            if(map.get(string.charAt(i)) == 1){
                idx = i;
                break;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        String s = "a";
        int result = firstNonRepeatingCharacter(s);
    }
}
