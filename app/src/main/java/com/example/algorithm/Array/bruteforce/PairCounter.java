package com.example.algorithm.Array.bruteforce;

/**
 * Given an array of N elements.Find the count of pairs (i,j) where i & j are indices such that array[i] + array[j] = k.
 * i!= j , i < j
 * TC = O(n^2) SC = O(1)
 * @Author: Archana Kumari
 * @Date: 03-02-2023
 */
public class PairCounter {
    public static int countPairCounter(int array[], int k) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int array[] = new int[]{
                2, 7, 3, 14, 6, 1, 0, 10, 14
        };
        System.out.println("PairCounter is:" + countPairCounter(array,20));
    }
}
