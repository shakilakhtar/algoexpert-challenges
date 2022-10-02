package com.challenge.algoexpert.recursion;

public class NthFibonacci {

    public static int getNthFib(int n) {
        // base case
        if(n <= 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }

        return   getNthFib(n-2) + getNthFib(n-1);
    }

    public static void main(String[] args) {
        int result = getNthFib(6);
        System.out.println(result);
    }
}
