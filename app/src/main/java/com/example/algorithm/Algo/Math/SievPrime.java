package com.example.algorithm.Algo.Math;

import java.util.Scanner;

/** This class demonstrate the work of seive algorithm for generate prime numbers within given range.
 * @Author: Archana Kumari
 * @Date: 06-10-2022
 */
public class SievPrime {
    public static void main(String[] args) {
        System.out.printf("Enter range to generate prime number:");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        scanner.close();
        primeNumber(range);
    }

    public static void primeNumber(int num) {
        // If we don`t give size num + 1 then it will give out of bound exception as
        // Multiple number we have to give for primer number and its size
        // i = 2 then for 10th item 8 + 2
        // We need to keep it on 11th cell on computer memory
        // as array indexing start from 0
        boolean primeArray[] = new boolean[num + 1];
        System.out.println("Length is" + primeArray.length);

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (!primeArray[i]) {
                for (int j = i * i; j <= num; j+=i) {
                    primeArray[j] = true;
                }
            }
        }


        // Print prime numbers:-
        for (int i = 2; i < primeArray.length; i++) {
            if (!primeArray[i]) {
                System.out.println("i = " + i);
            }
        }
    }
}
