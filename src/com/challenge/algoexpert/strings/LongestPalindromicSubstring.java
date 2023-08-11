package com.challenge.algoexpert.strings;

public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String str) {
        if(str.isEmpty()) {
            return "";
        }
        int len = str.length();
        //boolean matrix whose upper triangle represents if the
        //substring i, j is a palindrome or not
        boolean[][] dp = new boolean[str.length()][str.length()];

        int longestSoFar = 0;
        int startIdx = 0;
        int endIdx = 0;


        for(int i = 0; i < len; i++) {
            dp[i][i] = true;
            for(int j = 0; j < i; j++) {
                if(str.charAt(j) == str.charAt(i) && (i-j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                    if(i-j+1 > longestSoFar) {
                        longestSoFar = i-j+1;
                        startIdx = j;
                        endIdx = i;
                    }
                }
            }
        }
        return str.substring(startIdx, endIdx+1);
    }

//    public static String longestPalindromicSubstring(String str) {
//        //boolean matrix whose upper triangle represents if the
//        //substring i, j is a palindrome or not
//        boolean[][] dp = new boolean[str.length()][str.length()];
//
//        //initialize the first character of the string as the longest palindrome
//        int leftIdxOfLongestPalindrome = 0;
//        int rightIdxOfLongestPalindrome = 0;
//
//        //now lets fill the upper triangle of the matrix
//
//        //populate the diagonal with true as
//        //every character in the input string is a palindrome of length 1
//        // i.e substring of length 1
//
//        for (int i = 0; i < str.length(); i++) {
//            dp[i][i] = true;
//        }
//
//        //substring of length 2
//        for (int i = 0; i < str.length() -1; i++) {
//            int j = i + 1;
//            //for substring of length 2
//            //there will be a palindrome if both character are same
//            dp[i][j] = str.charAt(i) == str.charAt(j);
//            //update the palindrome if we found a larger palindrome
//            if (dp[i][j] && j - i > rightIdxOfLongestPalindrome - leftIdxOfLongestPalindrome){
//                leftIdxOfLongestPalindrome = i;
//                rightIdxOfLongestPalindrome = j;
//            }
//
//        }
//
//        //substring of length > 2
//        for (int k = 2; k < str.length(); k++) {
//            for (int i = 0; i < str.length() -1; i++) {
//                int j = i + 1;
//                //for substring of length > 2, there will be a palindrome if
//                // the string obtained by removing first and last character
//                // from the substring is a palindrome and the first and last character
//                //of the substring are same
//                //eg: abba is a palindrome as bb is a palindrome and a==a
//                dp[i][j] = dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j);
//                //update the palindrome if we found a larger palindrome
//                if (dp[i][j] && j - i > rightIdxOfLongestPalindrome - leftIdxOfLongestPalindrome){
//                    leftIdxOfLongestPalindrome = i;
//                    rightIdxOfLongestPalindrome = j;
//                }
//            }
//
//        }
//
//        return str.substring(leftIdxOfLongestPalindrome, rightIdxOfLongestPalindrome + 1);
//    }


}
