/**
 * Author: Archana Kumari
 * Date: 6/11/26
 * File: SpiralMatrix.java
 * 54. Spiral Matrix
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * <p>
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

package com.example.algorithm.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println("list = " + list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        System.out.println("m = " + m);
        int n = matrix[0].length;
        System.out.println("n = " + n);

        int startRow = 0;
        int startCol = 0;
        int endRow = m - 1;
        int endCOl = n - 1;

        while (startRow <= endRow && startCol <= endCOl) {
            for (int i = startCol; i <= endCOl; i++) {
                list.add(matrix[startRow][i]);
            }
            startRow = startRow + 1;
            for (int i = startRow; i <= endRow; i++) {
                list.add(matrix[i][endCOl]);
            }
            endCOl = endCOl - 1;
            if (startRow <= endRow) {
                for (int i = endCOl; i >= startCol; i--) {
                    list.add(matrix[endRow][i]);
                }
                endRow = endRow - 1;
            }

            if (startCol <= endCOl) {
                for (int i = endRow; i >= startRow; i--) {
                    list.add(matrix[i][startCol]);
                }
                startCol = startCol + 1;
            }
        }

        return list;
    }
}
