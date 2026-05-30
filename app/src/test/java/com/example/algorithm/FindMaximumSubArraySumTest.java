/**
 * Author: Archana Kumari
 * Date: 5/30/26
 * File: FindMaximumSubArraySum.java
 */

package com.example.algorithm;

import static com.example.algorithm.Array.subarray.bruteforce.FindMaximumSubArraySum.findMaxSubArraySum;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FindMaximumSubArraySumTest {
    @Test
    public void testPositiveNumbers() {
        int[] array = {1, 2, 3, 4};
        int result = findMaxSubArraySum(array);
        assertEquals(10, result); // Whole array sum
    }

    @Test
    public void testMixedNumbers() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = findMaxSubArraySum(array);
        assertEquals(6, result); // Subarray [4, -1, 2, 1]
    }

    @Test
    public void testAllNegativeNumbers() {
        int[] array = {-5, -2, -8, -1};
        int result = findMaxSubArraySum(array);
        assertEquals(-1, result); // Single element max
    }

    @Test
    public void testSingleElement() {
        int[] array = {7};
        int result = findMaxSubArraySum(array);
        assertEquals(7, result);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        // Defensive check: your current method assumes array[0] exists.
        // You may want to handle empty arrays separately.
        // For now, let's assertThrows
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            findMaxSubArraySum(array);
        });
    }
}
