package com.challenge.algoexpert.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ShortenPath {
    public static String shortenPath(String path) {
        boolean absolutePath = path.charAt(0) == '/';
        String[] tokens  = path.split("/");
        List<String> tokenList = Arrays.asList(tokens);
        List<String> filteredTokens = tokenList.stream()
                .filter(token -> isImportantToken(token)).collect(Collectors.toList());

        Stack<String> stack = new Stack<>();
        if (absolutePath){
            stack.add("");
        }
        for (String token: filteredTokens) {
            if (token.equals("..")){
                if (stack.isEmpty() || stack.peek().equals("..")){
                    stack.add(token);
                } else if (!stack.peek().equals("")) {
                    stack.pop();
                }
            }else {
                stack.add(token);
            }
        }

        if (stack.size() == 1 && stack.peek().equals("")){
            return "/";
        }

        return String.join("/",stack);
    }

    public static boolean isImportantToken(String token){
        return token.length() > 0 && !token.equals(".");
    }
}
