package com.challenge.algoexpert.greedyalgoriths;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassPhotos {
    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        redShirtHeights.sort(Comparator.reverseOrder());
        blueShirtHeights.sort(Comparator.reverseOrder());
        String shirtColorInFirstRow = "";
        if(redShirtHeights.get(0) < blueShirtHeights.get(0)) {
            shirtColorInFirstRow = "RED";
        }
        else{
            shirtColorInFirstRow = "BLUE";
        }
        for (int i = 0; i < redShirtHeights.size(); i++) {
            int redShirtHeight = redShirtHeights.get(i);
            int blueShirtHeight = blueShirtHeights.get(i);

            if (shirtColorInFirstRow == "RED"){
                if (redShirtHeight >= blueShirtHeight){
                    return false;
                }
            }else{
                if (blueShirtHeight >= redShirtHeight){
                    return false;
                }
            }
        }
        return true;
    }
}
