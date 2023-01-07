package com.example.algorithm;

/**
 * @Author: Archana Kumari
 * @Date: 07-01-2023
 */
public class Utils {
    public static int getMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int data : arr) {
            if (max < data) {
                max = data;
            }
        }
        return max;
    }
}
