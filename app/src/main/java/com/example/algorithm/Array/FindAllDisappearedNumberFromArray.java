/**
 * Author: Archana Kumari
 * Date: 6/5/26
 * File: FindAllDisappearedNumberFromArray.java
 */

package com.example.algorithm.Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNumberFromArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("find all disappeared elements from array = " + findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedList = new ArrayList();
        for(int i = 0; i< nums.length;i++) {
            int visitedIndex = Math.abs(nums[i]) - 1;
            if(nums[visitedIndex] > 0){
                nums[visitedIndex] = nums[visitedIndex] * -1;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 )
                disappearedList.add(i+1);
        }
        return disappearedList;
    }
}


