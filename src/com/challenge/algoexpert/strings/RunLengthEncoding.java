package com.challenge.algoexpert.strings;

public class RunLengthEncoding {
    public String runLengthEncoding(String string) {
        String encoded = "";
        char letter = string.charAt(0);
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (letter == string.charAt(i) && count < 9){
                count++;
            }
            else if(letter != string.charAt(i) || count >= 9){
                encoded += ""+ count + letter;
                count = 1;
            }
            letter = string.charAt(i);
        }
        encoded += ""+ count + letter;
        return encoded;
    }
}
