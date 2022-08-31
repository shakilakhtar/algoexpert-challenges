package com.challenge.algoexpert.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonSubsequence {

    public static List<Character> longestCommonSubsequence(String str1, String str2) {
        String s = lcs(str1,str2);
        List<Character> list = s.chars().mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        return list;
    }

    public static String lcs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        //fill first column
        for (int i = 0; i <=m ; i++) {
            dp[i][0] = 0;
        }
        //fill first row
        for (int j = 0; j <=n ; j++) {
            dp[0][j] = 0;
        }
        //fill dp table
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        //length of longest common subsequence
     //return dp[m][n];
        // traverse back to get LCS string in dp table from bottom position
        int idx = dp[m][n];
        int temp = idx;
        int i=m;
        int j=n;
        StringBuilder sb = new StringBuilder();
        while (i > 0 && j > 0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            }else {
                j--;
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(s1.length());
        String c  = lcs(s1,s2);
        System.out.println(c);
    }
}
