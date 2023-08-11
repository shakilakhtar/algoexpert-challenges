package com.challenge.algoexpert.strings;

public class ReverseWordsInString {

    public String reverseWordsInString(String string) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (int i = string.length() - 1; i >=0 ; i--) {
            char c = string.charAt(i);
            if (c  == ' '){
                if (currentWord.length() > 0){
                    result.append(currentWord.toString());
                    currentWord.setLength(0);
                }
                result.append(" ");
            }else {
                currentWord.insert(0,c);
            }
        }
        result.append(currentWord.toString());

        return result.toString();
    }
}
