package com.example.algorithm.Algo.Math;

import java.util.ArrayList;

/*
* 1492. The kth Factor of n
Medium
Topics
premium lock iconCompanies
Hint

You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.

Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.*/
public class KthFactor {

    public static void main(String[] args){
        System.out.println("Kth factor of 100 if k  is 3" +  kthFactor(100, 3));
        System.out.println("Kth factor of 100 if k  is 3" +  kthFactor(12, 12));

    }

    public static int kthFactor(int n, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 1; i*i<= n; i++){
            if(n %i == 0)
                arrayList.add(i);
        }
        if(k <= arrayList.size())
        return arrayList.get(k);
        else return  -1;

    }
}
