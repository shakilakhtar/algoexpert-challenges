package com.challenge.algoexpert.arrays;

import java.util.Arrays;

/**
 *
 */
public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        // Algo
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for (int coin:coins){
            //if the current change created + 1 is less than current coin
            // change will not be possible for that number
            if(coin > currentChangeCreated+1 ){
                return currentChangeCreated+1;
            }
            currentChangeCreated+= coin;
        }

        return currentChangeCreated+1;
    }
}
