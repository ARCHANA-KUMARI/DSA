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
            temp =0;
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
       // A = [1, 2, 4, 3]
      /*  ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);*/
       //  A = [2, 1, 2, 3]

        ArrayList list = new ArrayList();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);

   /*     ArrayList list = new ArrayList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);*/
    /*  //  A : [ 70888, 2417, 136, 95979, 93360, 55711, 80569 ]
        ArrayList list = new ArrayList();
        list.add(70888);
        list.add(2417);
        list.add(136);
        list.add(95979);
        list.add(93360);
        list.add(55711);
        list.add(80569);*/

      //  A : [ 19693, 90763, 23586, 18259, 15715, 8892, 1366, 8309, 66170, 19072, 14992, 91483, 97245, 48005, 33421, 71066, 13466, 30368, 64109, 16774, 75716, 46089, 16630, 48154, 54068, 90749, 79857, 23699, 36068, 16539, 75467, 70069, 8531, 74888, 45046, 63364, 1700, 46827, 66181, 84044, 5470, 16145, 15859 ]
        System.out.println("No of Triplet count:" + getTripletCount(list));
    }
}
