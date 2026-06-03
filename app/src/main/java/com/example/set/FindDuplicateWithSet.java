/**
 * Author: Archana Kumari
 * Date: 6/3/26
 * File: FindDuplicateWithSet.java
 * Description:287. Find the Duplicate Number
 * T(C) : O(n)
 * S(C): O(n)
 */

package com.example.set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWithSet {
    public static void main(String[] args) {
        int array[] = {3, 1, 3, 4, 2};
        System.out.println("Duplicate number = " + findDuplicate(array));
    }

    public static Integer findDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i]))
                return array[i];
            set.add(array[i]);
        }
        return -1;
    }
}
