/**
 * Author: Archana Kumari
 * Date: 5/4/26
 * File: PrintSubstringsTest.java
 */

package com.example.algorithm;

import static org.junit.Assert.assertEquals;

import com.example.algorithm.string.slidingwindow.PrintSubstrings;

import org.junit.Test;

public class PrintSubstringsTest {
    @Test
    public void testExampleCase() {
        assertEquals(8, PrintSubstrings.printUniqueSubstrings("abac"));
    }

    @Test
    public void testSingleChar() {
        assertEquals(1, PrintSubstrings.printUniqueSubstrings("a"));
    }

    @Test
    public void testAllUnique() {
        // "abc" → substrings: a, ab, abc, b, bc, c → total = 6
        assertEquals(6, PrintSubstrings.printUniqueSubstrings("abc"));
    }

    @Test
    public void testAllSameChar() {
        // "aaa" → substrings: a, a, a → total = 3
        assertEquals(3, PrintSubstrings.printUniqueSubstrings("aaa"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, PrintSubstrings.printUniqueSubstrings(""));
    }
}
