package com.example.algorithm.Array;

import com.example.algorithm.Utils;

/**
 * Find the array of Size N, Find the count of elements which has atleast one element greater than itself.
 *
 * @Author: Archana Kumari
 * @Date: 01-02-2023
 */
public class ElementCountGreaterThanItself {

    public static void main(String args[]) {
        int array[] = new int[]{-3, -2, 6, 8, 4, 8, 5}; // ans = 5
        //int array[] = new int[]{2, 5, 1, 4, 8, 0, 8, 1, 3, 8}; // ans = 7
        //int array[] = new int[]{1,1,1,1,1};
       // System.out.println("Element count which is greater than itself" + countElementGreaterThanItself(array));
        System.out.println("Element count which is greater than itself" + countElementGreaterThanItselfInOneLoop(array));
    }

    public static long countElementGreaterThanItself(int array[]) {
        int max = Utils.getMax(array);
        int maxFreq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                maxFreq = maxFreq + 1;
        }
        return array.length - maxFreq;
    }

    public static long countElementGreaterThanItselfInOneLoop(int array[]) {
        int maxFreq = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            // Find max here only and count freq of maximum element of array
            if(max < array[i])
            {
                max = array[i];
                maxFreq = 0;
            }
            if (array[i] == max)
                maxFreq = maxFreq + 1;
        }
        return array.length - maxFreq;
    }
}

