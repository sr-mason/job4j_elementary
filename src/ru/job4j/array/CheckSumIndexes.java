package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] mass = new int[0];
        int  k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                } else {
                    mass = Arrays.copyOf(mass, ++k);
                    mass[k - 1] = data[i][j];
                }
            }
        }
        return mass;
    }
}