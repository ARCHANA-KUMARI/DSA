package com.example.algorithm.Algo.Math;

public class ConsiderAllPair {
    public static void main(String[] args) {
        char[] charArray = {
                'b', 'c', 'a', 'g', 'g', 'a', 'a', 'g'
        };

        System.out.println("Get all pairs count:" + countAllPair(charArray));


    }

    private static int countAllPair(char[] array) {
        if (array.length == 0)
            return -1;
        int countAllPair = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != 'a') {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == 'g') {
                    countAllPair++;
                }
            }
        }
        return countAllPair;
    }

}

