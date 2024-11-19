package org.example.MultidimensionalArrays;

public class MArray {
    public static void main(String[] args) {
        int[][] matrica = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Broj na poziciji [1][1] je: " + matrica[1][1]);

    }
}
