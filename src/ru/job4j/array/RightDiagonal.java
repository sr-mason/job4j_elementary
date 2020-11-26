package ru.job4j.array;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {

        int[] a = new int[data.length];
        int k = 0;
        int j = 0;
        b:
        for (int[] datum : data) {
            while (j < datum.length) {
                a[k++] = datum[data.length - j - 1];
                j++;
                continue b;
            }
        }
        return a;
    }
}