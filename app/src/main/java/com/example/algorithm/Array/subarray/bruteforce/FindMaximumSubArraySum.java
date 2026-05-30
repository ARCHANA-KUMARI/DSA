/**
 * Author: Archana Kumari
 * Date: 5/30/26
 * File: FindMaximumSubArraySum.java
 */

package com.example.algorithm.Array.subarray.bruteforce;

public class FindMaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("findMaxSubArraySum(arr) = " + findMaxSubArraySum(arr));
    }
    
     public static int findMaxSubArraySum(int array[]){
        int maxSubArraySum = array[0];

        for(int i = 0; i < array.length;i++){
            int currentSubArraySum = 0;
            for(int j = i ; j<array.length; j++){
                currentSubArraySum = currentSubArraySum + array[j];
                maxSubArraySum = Math.max(maxSubArraySum, currentSubArraySum);
            }
        }
        return maxSubArraySum;
    }

}
