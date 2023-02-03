package com.example.algorithm.Array.bruteforce;

import java.util.ArrayList;

/**
 * You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 * @Author: Archana Kumari
 * @Date: 03-02-2023
 */
public class TripletCounter {

    public static int getTripletCount(ArrayList<Integer> A) {
        int temp = 0;
        int tripletCount = 0;
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (temp > A.get(i) && temp < A.get(j)) {
                    tripletCount++;
                } else if (A.get(i) < A.get(j)) {
                    temp = A.get(j);
                }
            }
        }
        return tripletCount;
    }

    public static void main(String[] args) {
   /*    // A = [1, 2, 4, 3]
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);*/
        /* A = [2, 1, 2, 3]*/

       /* ArrayList list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);*/

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println("No of Triplet count:" + getTripletCount(list));
    }
}
