package com.challenge.algoexpert.strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
      int firstPtr = 0;
      int lastPtr = str.length()-1;
        boolean flag = false;
      while (firstPtr <= lastPtr){
          if(str.charAt(firstPtr)==str.charAt(lastPtr)){
              flag =true;
              firstPtr++;
              lastPtr--;
          }else {
              flag =false;
              break;
          }
      }

        return flag;
    }

    public static void main(String[] args) {
        String s = "abcdefghihgfeddcba";
        boolean res = isPalindrome(s);
    }
}
