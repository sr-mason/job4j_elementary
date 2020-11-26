package ru.job4j.array;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] a = new int[data.length * data.length];
        int k = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                a[k++] = i;
            }
        }
        return a;
    }
}