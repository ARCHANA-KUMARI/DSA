/**
 * Author: Archana Kumari
 * Date: 5/31/26
 * File: ProductOfArrayItself.java
 * Bruteforce approach
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * <p>
 * T(C) : O(N*N)
 * S(C) = O(N)
 */

package com.example.algorithm.Array.subarray.bruteforce;

import java.util.Scanner;

public class ProductOfArrayItself {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter numbr of = :");
        Integer size = scanner.nextInt();
        System.out.println("Enter elements  = " + size);
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("print productExceptSelf = ");
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] productExceptSelf(int nums[]) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    prod = prod * nums[j];
                    ans[i] = prod;
                }


            }

        }
        return ans;
    }
}
