package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int k = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                k++;
            }
        }
        int[] temp = new int[k];
        int l = (int) Math.ceil(Math.sqrt(k));
        int[][] a = new int[l][l];
        k = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                temp[k++] = anInt;
            }
        }
        k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (k < temp.length) {
                    a[i][j] = temp[k];
                    k++;
                } else {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
}