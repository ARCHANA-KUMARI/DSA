package com.example.algorithm.pattern;

import java.util.Scanner;

/**
 * @Author: Archana Kumari
 * @Date: 24-12-2022
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter terms:-");
        int terms = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < terms; i++) {
            for (int j = 0; j <= i; j++) {
                if( (i + j) % 2 == 0 )
                  System.out.print("1");
                else
                    System.out.print("0");

            }
            System.out.println();
        }
    }
}
