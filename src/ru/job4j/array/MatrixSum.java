package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] out : array) {
            for (int in : out) {
                rsl += in;
            }
        }
        return rsl;
    }
}