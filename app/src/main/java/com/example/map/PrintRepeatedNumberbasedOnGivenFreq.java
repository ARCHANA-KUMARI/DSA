/**
 * Author: Archana Kumari
 * Date: 6/3/26
 * File: PrintRepeatedNumberbasedOnGivenFreq.java
 * Print the numbers which is repeated in given array till given number of times.
 */

package com.example.map;

import android.os.Build;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedNumberbasedOnGivenFreq {
    public static void main(String[] args) {
        //int[] array = {3, 1, 4, 4, 5, 2, 6, 1};
        int[] array = {3, 1, 4, 4,4, 5, 2, 6, 1};

        HashMap<Integer, Integer> map = findRepeatedNumber(array);
        System.out.println("map = " + map);
        // Filtering manually equal to 2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

    }

    public static HashMap<Integer, Integer> findRepeatedNumber(int[] array) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else if (map.get(array[i]) <= 2) {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        return map;
    }
}


