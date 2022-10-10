package com.challenge.algoexpert.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberMnemonics {
    private static Map<Character, String[]> digitLetters = new HashMap<>();
    static {
        digitLetters.put('0',new String[]{"0"});
        digitLetters.put('1',new String[]{"1"});
        digitLetters.put('2',new String[]{"a","b","c"});
        digitLetters.put('3',new String[]{"d","e","f"});
        digitLetters.put('4',new String[]{"g","h","i"});
        digitLetters.put('5',new String[]{"j","k","l"});
        digitLetters.put('6',new String[]{"m","n","o"});
        digitLetters.put('7',new String[]{"p","q","r","s"});
        digitLetters.put('8',new String[]{"t","u","v"});
        digitLetters.put('9',new String[]{"w","x","y","z"});
    }

    private static ArrayList<String> result;

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        result = new ArrayList<>();
        backtrack(0, "", phoneNumber);
        return result;
    }

   public static void backtrack(int idx, String current, String phoneNumber){
        if (current.length() == phoneNumber.length()){
            result.add(current);
            return;
        }
        String[] letters = digitLetters.get(phoneNumber.charAt(idx));
        int k = letters.length;
       for (int i = 0; i < k; i++) {
           String newStr = current + letters[i];
           backtrack(idx + 1, newStr, phoneNumber);
       }
   }
}
