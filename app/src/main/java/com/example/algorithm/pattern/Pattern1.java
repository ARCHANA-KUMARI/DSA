package com.example.algorithm.pattern;

import java.util.Scanner;

/**
 * @Author: Archana Kumari
 * @Date: 24-12-2022
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter terms:-");
        int terms = scanner.nextInt();
        scanner.close();
        int k = 0;
        for (int i = 0; i < terms; i++) {
            k = i + 2;
            for (int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}
