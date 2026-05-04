/**
 * Author: Archana Kumari
 * Date: 5/4/26
 * File: PrintSubstrings.java
 * Description: Bruteforce approach
 */

package com.example.algorithm.string.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class PrintSubstrings {

    public static void printUniqueSubstrings(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (seen.contains(c)) break; // stop if duplicate
                seen.add(c);
                sb.append(c);
                count++;
                System.out.println(sb.toString()); // print substring
            }
        }
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {
        String s = "abac";
        printUniqueSubstrings(s);
    }
}
