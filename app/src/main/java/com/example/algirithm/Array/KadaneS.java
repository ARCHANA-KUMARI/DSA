package com.example.algirithm.Array;

import java.util.Scanner;

/** Find Contigous maximum sub array.
 * @Author: Archana Kumari
 * @Date: 09-10-2022
 */
public class KadaneS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter number of elements:");
        int noOfElemenet = scanner.nextInt();
        System.out.println("Enter number of elements:");

        int array[] = new int[10];
        for(int i = 0; i < noOfElemenet; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Sub array count = " + maxContiguousSubArray(array));
    }

    public static int  maxContiguousSubArray(int array[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < array.length ; i++){
            currentSum = currentSum + array[i];
            if(maxSum < currentSum)
                maxSum = currentSum;
            else if(currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}
