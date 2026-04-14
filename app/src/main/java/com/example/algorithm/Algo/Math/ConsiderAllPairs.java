package com.example.algorithm.Algo.Math;

public class ConsiderAllPairs {
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
        int countAllCharacterA = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                countAllCharacterA++;
            } else if (array[i] == 'g') {
                countAllPair = countAllPair + countAllCharacterA;
            }

        }
        return countAllPair;
    }
}
