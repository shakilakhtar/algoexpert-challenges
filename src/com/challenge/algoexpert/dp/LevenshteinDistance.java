package com.challenge.algoexpert.dp;

public class LevenshteinDistance {

    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        return editDistance(str1,str2,str1.length(),str2.length());
    }

    public static int editDistance(String s1, String s2, int m, int n){
        if (m==0){return n;}
        if (n==0){return m;}
        if (s1.charAt(m-1)==s2.charAt(n-1)){
            return editDistance(s1,s2,m-1,n-1);
        }else {

            return 1 + Math.min(editDistance(s1, s2, m, n - 1),
                    Math.min(editDistance(s1, s2, m - 1, n),
                            editDistance(s1, s2, m - 1, n - 1)));
        }
    }

    public static int editDistanceDP(String s1, String s2, int m, int n){
        if (m==0){return n;}
        if (n==0){return m;}
        int[][] dp = new int[m+1][n+1];
        //fill by rows first (first column)
        for (int i = 0; i <= m; i++) {
            dp[i][0]=i;
        }
        //fill by column first (first row)
        for (int j = 0; j <=n ; j++) {
            dp[0][j]=j;
        }
        //fill rest of the dp table
        for (int i = 1; i <=m ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
    }
}
