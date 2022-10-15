package com.challenge.algoexpert.strings;

public class CaesarCypherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray()){
            int newCharAscii = (c-'a'+key)%26 +'a';
            char newChar =(char)newCharAscii;
            sb.append(newChar);
        }
        return sb.toString();
    }
}
