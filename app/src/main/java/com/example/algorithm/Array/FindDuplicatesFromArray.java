/**
 * Author: Archana Kumari
 * Date: 6/5/26
 * File: FindDuplicatesFromArray.java
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
 *
 * You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output
 */

package com.example.algorithm.Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesFromArray {
    public static void main(String[] args) {
        int array[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("findDuplicates(array) = " + findDuplicates(array));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                list.add(index + 1);
            nums[index] = nums[index] * -1;
        }
        return list;
    }
}
