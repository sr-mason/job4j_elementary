package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[] a = new int[data[src].length];
        for (int j = 0; j < data[src].length; j++) {
            a[j] = data[src][j];
            data[src][j] = data[dst][j];
            data[dst][j] = a[j];
        }
    }
}