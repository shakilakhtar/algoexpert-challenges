package com.challenge.algoexpert.greedyalgoriths;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TandemBicycle {
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        if (!fastest){
            redShirtSpeeds = Arrays.stream(redShirtSpeeds).boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
        int totalSpeed = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            int rider1 = redShirtSpeeds[i];
            int rider2 = blueShirtSpeeds[blueShirtSpeeds.length -i -1];
            totalSpeed+= Math.max(rider1,rider2);
        }
        return totalSpeed;
    }

    public static void main(String[] args) {
        int []blueShirtSpeeds = {3, 6, 7, 2, 1};
        boolean fastest = false;
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};

        tandemBicycle(redShirtSpeeds,blueShirtSpeeds,fastest);
    }
}
