package com.challenge.algoexpert.arrays;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        int[] leftProductArray = new int[array.length];
        leftProductArray[0]=1;
        int[] rightProductArray = new int[array.length];
        rightProductArray[array.length-1]=1;
        int currentLeftProduct =1;
        for (int i=0;i<array.length;i++){
            leftProductArray[i]=currentLeftProduct;
            currentLeftProduct*=array[i];
        }

        int currentRightProduct=1;
        for (int i=array.length-1;i>=0;i--){
            rightProductArray[i]=currentRightProduct;
            currentRightProduct*=array[i];
        }
        int[] arrayProduct = new int[array.length];
        for (int i=0;i<arrayProduct.length;i++){
            arrayProduct[i]=leftProductArray[i]*rightProductArray[i];
        }
        return arrayProduct;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5,1,4,2};
        int[] result =  arrayOfProducts(array);
    }
}
