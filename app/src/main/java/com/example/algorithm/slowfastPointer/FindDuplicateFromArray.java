/**
 * Author: Archana Kumari
 * Date: 6/4/26
 * File: FindDuplicateFromArray.java
 * T(c): O(n)
 * S(c): O(1)
 */

package com.example.algorithm.slowfastPointer;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {
                3, 1, 3, 4, 2
        };
        System.out.println("Duplicate Element from Array = " + findDuplicateFromArray(array));
    }

    private static int findDuplicateFromArray(int[] array) {
        int slow = array[0];
        int fast = array[0];
        do {
            slow = array[slow];
            fast = array[array[fast]];
        } while (slow != fast);

        slow = array[0];
        while (slow != fast) {
            slow = array[slow];
            fast = array[fast];
        }
        return slow;

    }
}
