package com.challenge.algoexpert.strings;

import java.util.ArrayList;

public class ValidIPAddresses {

    public static ArrayList<String> validIPAddresses(String string) {

        ArrayList<String> result =  new ArrayList<>();
        for (int i = 0; i < string.length() - 3; i++) {
            for (int j = i + 1; j < string.length() - 2; j++) {
                for (int k = j + 1; k < string.length() - 1; k++) {
                    String firstOctet = string.substring(0, i + 1);
                    String secondOctet = string.substring(i + 1, j + 1);
                    String thirdOctet = string.substring(j + 1, k + 1);
                    String fourthOctet = string.substring(k + 1);


                    if (isValidOctet(firstOctet) && isValidOctet(secondOctet)
                            && isValidOctet(thirdOctet) && isValidOctet(fourthOctet)){
                        String ip = firstOctet + "." + secondOctet + "." + thirdOctet + "." + fourthOctet;
                        result.add(ip);
                    }
                }

            }

        }

        return result;
    }

    private static boolean isValidOctet(String octet){
        if (octet.length() > 0 && octet.length() < 4){
            if (octet.length() > 1 && octet.charAt(0) == '0'){
                return false;

            }
            int val = Integer.parseInt(octet);
            if ( val >= 0 && val <= 255){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "1921680";
        validIPAddresses(s);
    }
}
