package com.challenge.algoexpert.greedyalgoriths;

public class ValidStartingCity {
    public int validStartingCity(int[] distances, int[] fuel, int mpg) {
        int noOfCities = distances.length;
        int milesRemaining = 0;

        int indexOfStartingCityCandidate = 0;
        int milesRemainingAtStartingCityCandidate = 0;

        for (int cityIdx = 1; cityIdx < noOfCities; cityIdx++) {
            int distanceFromPreviousCity = distances[cityIdx - 1];
            int fuelFromPreviousCity = fuel[cityIdx - 1];

            milesRemaining+= fuelFromPreviousCity * mpg - distanceFromPreviousCity;

            if (milesRemaining < milesRemainingAtStartingCityCandidate){
                milesRemainingAtStartingCityCandidate = milesRemaining;
                indexOfStartingCityCandidate = cityIdx;
            }
        }

        return indexOfStartingCityCandidate;
    }

    public int validStartingCityBruteForce(int[] distances, int[] fuel, int mpg){
         int noOfCities = distances.length;

        for (int startCityIdx = 0; startCityIdx < noOfCities; startCityIdx++) {
            int milesRemaining = 0;

            for (int currentCityIdx = startCityIdx; currentCityIdx < startCityIdx + noOfCities;) {
                if (milesRemaining < 0){
                    continue;
                }
                 currentCityIdx = currentCityIdx % noOfCities;
                int fuelFromCurrentCity = fuel[currentCityIdx];
                int distanceToNextCity = distances[currentCityIdx];
                milesRemaining += fuelFromCurrentCity * mpg - distanceToNextCity;
            }

            if (milesRemaining >= 0){
                return startCityIdx;
            }
        }
        return -1;
    }
}
