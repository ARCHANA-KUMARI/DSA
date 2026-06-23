/**
 * Author: Archana Kumari
 * Date: 6/23/26
 * File: LuckyNumberInMatrix.java
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 */

package com.example.algorithm.matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
        };
        System.out.println("Lucky number in matrix = " + luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        HashSet<Integer> minInRowSet = new HashSet<>();
        HashSet<Integer> maxInColSet = new HashSet<>();

        int minRow, maxCol;

        for (int i = 0; i < rows; i++) {
            minRow = matrix[i][0];
            for (int j = 0; j < cols; j++) {
                minRow = Math.min(minRow, matrix[i][j]);

            }
            minInRowSet.add(minRow);
        }

        for (int i = 0; i < cols; i++) {
            maxCol = matrix[0][i];
            for (int j = 0; j < rows; j++) {
                maxCol = Math.max(maxCol, matrix[j][i]);

            }
            maxInColSet.add(maxCol);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(minInRowSet.contains(matrix[i][j]) && maxInColSet.contains(matrix[i][j])){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}
