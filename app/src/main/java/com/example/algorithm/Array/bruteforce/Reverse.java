package com.example.algorithm.Array.bruteforce;

/**
 * @Author: Archana Kumari
 * @Date: 04-02-2023
 */
public class Reverse {
    public static int[] reverse(int array[]) {
        int i = array.length - 1;
        int j = 0;
        int temp;
        while (j <= i) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i--;
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
       // int array[] = new int[]{1, 2, 3, 4, 5, 6};
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Reverse");
        array = reverse(array);
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
