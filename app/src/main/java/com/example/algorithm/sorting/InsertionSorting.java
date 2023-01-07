package com.example.algorithm.sorting;

/**
 * @Author: Archana Kumari
 * @Date: 28-12-2022
 */
public class InsertionSorting {
    public static void main(String[] args) {
        int arr[] = {82, 42, 49, 8, 25, 52, 36, 93, 59};
        int unsortedItem;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            unsortedItem = arr[i];
            for (j = i - 1; j >= 0 && unsortedItem < arr[j]; j--) {
                System.out.println("Inside for unsortedItem" + unsortedItem + "J is" + j + ":" + arr[j]);
                arr[j + 1] = arr[j];
            }
            System.out.println("unsortedItem" + unsortedItem);
            System.out.println("j before" + j);
            arr[j + 1] = unsortedItem;
            System.out.println("j" + j);
            System.out.println("arr[0]" + arr[0]);
            System.out.println("arr[1]" + arr[1]);
        }
    }
}
