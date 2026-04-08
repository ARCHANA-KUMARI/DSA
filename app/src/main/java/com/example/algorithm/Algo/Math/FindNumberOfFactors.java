package com.example.algorithm.Algo.Math;
/** This class demonstrate to calculate the number of all factors of given number..
 * @Author: Archana Kumari
 * @Date: 06-10-2026
 */


public class FindNumberOfFactors {
    public static void main(String[] args) {
        System.out.println("NO of factors of Given number:" + countFactors(24));
        System.out.println("NO of factors of Given number:" + countFactors(100));
        System.out.println("NO of factors of Given number:" + countFactors(25));
        System.out.println("NO of factors of Given number:" + countFactors(1));
        System.out.println("NO of factors of Given number:" + countFactors(0));
        System.out.println("NO of factors of Given number:" + countFactors(-1));
    }

    private static int countFactors(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i != num / i) {
                    count += 2;
                } else {
                    count += 1;
                }
            }
        }
        return count;
    }
}
