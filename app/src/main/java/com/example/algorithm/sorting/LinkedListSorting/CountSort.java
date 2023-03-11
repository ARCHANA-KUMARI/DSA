package com.example.algorithm.sorting.LinkedListSorting;

import com.example.algorithm.Utils;

/**
 * @Author: Archana Kumari
 * @Date: 07-01-2023
 */
public class CountSort {
    public static int[] countSort(int arr[]) {
        int max = Utils.getMax(arr);
        System.out.println("Max is:" + max);
        // Count array
        int countArray[] = new int[max + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]] = countArray[arr[i]] + 1;
        }

        int i = 0, j = 0;
        while (i <= max) {
            if (countArray[i] > 0) {
                arr[j] = i;
                countArray[i] = countArray[i] - 1;
                j++;
            } else {
                i++;
            }
        }
        return arr;
    }

    public static int[] countSortNegativeArray(int arr[]) {
        int max = Utils.getMax(arr);
        int min = Utils.getMin(arr);
        System.out.println("Max is:" + max);
        System.out.println("Min is:" + min);
        int range = max - min;
        // Count array
        int countArray[] = new int[range + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i] - min] =  countArray[arr[i] - min] + 1;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i - 1] + countArray[i] ;
        }

        int outputArray[] = new int[arr.length];

        for(int i = arr.length - 1 ; i >= 0; i--){
            outputArray[countArray[arr[i] - min] - 1 ] = arr[i];
            countArray[arr[i] - min] = countArray[arr[i] - min] - 1;
        }
        return outputArray;
    }

    public static int[] countSort2ndWay(int arr[]) {
        int max = Utils.getMax(arr);
        System.out.println("Max is:" + max);
        // Count array
        int countArray[] = new int[max + 1];
        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]] = countArray[arr[i]] + 1;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i - 1] + countArray[i] ;
        }

       int outputArray[] = new int[arr.length];

       for(int i = arr.length - 1 ; i >= 0; i--){
           countArray[arr[i]] = countArray[arr[i]] - 1;
           outputArray[countArray[arr[i]]] = arr[i];
       }
        return outputArray;
    }


    public static void main(String[] args) {
        //int arr[] = { 0, 1, 4, 1, 2, 7, 5, 2};
       // int arr[] = { 0, 1, 4, 1, 2, 77000, 5, 2};
        int arr[] = { 0, 1, 4, 1, 2, -770, 5, 2};
        //arr = countSort(arr);
        //arr = countSort2ndWay(arr);
        arr = countSortNegativeArray(arr);

        // Print sorted list
        for(int i = 0 ; i < arr.length ; i++){
          System.out.print(arr[i] + " ");
        }
    }
}
