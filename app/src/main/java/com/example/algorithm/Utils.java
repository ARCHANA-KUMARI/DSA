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

    public static int getMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int data : arr) {
            if (data < min) {
                min = data;
            }
        }
        return min;
    }
}
