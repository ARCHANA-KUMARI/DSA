package com.example.algorithm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


import com.example.algorithm.Algo.Math.ConsiderAllPairs;

public class ConsiderAllPairsTest {

    @Test
    public void testEmptyArray() {
        char[] array = {};
        assertEquals(0, ConsiderAllPairs.countAllPair(array));
    }

    @Test
    public void testNoPairs() {
        char[] array = {'b', 'c', 'd'};
        assertEquals(0, ConsiderAllPairs.countAllPair(array));
    }

    @Test
    public void testSinglePairAG() {
        char[] array = {'a', 'g'};
        assertEquals(1, ConsiderAllPairs.countAllPair(array));
    }

    @Test
    public void testMultiplePairsAG() {
        char[] array = {'a', 'a', 'g', 'g'};
        // First 'g' pairs with 2 'a's, second 'g' pairs with 2 'a's → total 4
        assertEquals(4, ConsiderAllPairs.countAllPair(array));
    }

    @Test
    public void testMixedCharactersAG() {
        char[] array = {'b', 'c', 'a', 'g', 'g', 'a', 'a', 'g'};
        // Expected = 5 pairs
        assertEquals(5, ConsiderAllPairs.countAllPair(array));
    }

    @Test
    public void testGenericBC() {
        char[] array = {'b', 'c', 'a', 'g'};
        // Only one 'b' before one 'c' → 1 pair
        assertEquals(1, ConsiderAllPairs.countAllPair(array, 'b', 'c'));
    }

    @Test
    public void testGenericXY() {
        char[] array = {'x', 'y', 'x', 'y'};
        // First 'y' pairs with 1 'x', second 'y' pairs with 2 'x' → total 3
        assertEquals(3, ConsiderAllPairs.countAllPair(array, 'x', 'y'));
    }

    @Test
    public void testGenericNoMatch() {
        char[] array = {'a', 'b', 'c'};
        // No 'z' present → 0 pairs
        assertEquals(0, ConsiderAllPairs.countAllPair(array, 'a', 'z'));
    }
}
