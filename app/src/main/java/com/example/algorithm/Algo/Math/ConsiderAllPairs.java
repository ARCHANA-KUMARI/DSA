package com.example.algorithm.Algo.Math;

public class ConsiderAllPairs {
    public static void main(String[] args) {
        char[] charArray = {
                'b', 'c', 'a', 'g', 'g', 'a', 'a', 'g'
        };

        System.out.println("Get all pairs count:" + countAllPair(charArray));

        char[] emptyArray = {

        };

        System.out.println("Get all pairs count:" + countAllPair(emptyArray));

        //Generic function for any two character pair

        System.out.println("Get all pairs count:charArray using generic method" + countAllPair(charArray,'b', 'c'));

    }

    public static int countAllPair(char[] array) {
        if (array.length == 0)
            return 0;
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

    /*Generic functions*/
    public static int countAllPair(char[] array, char first, char second) {
        int countFirst = 0, countPair = 0;
        for (char c : array) {
            if (c == first) countFirst++;
            else if (c == second) countPair += countFirst;
        }
        return countPair;
    }

}
