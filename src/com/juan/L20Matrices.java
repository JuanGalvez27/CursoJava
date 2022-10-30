package com.juan;

public class L20Matrices {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0}
        };
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        for(int[]fila:matrix){
            System.out.println();
            for(int z:fila){
                System.out.print(z + " ");
            }
        }
    }
}
