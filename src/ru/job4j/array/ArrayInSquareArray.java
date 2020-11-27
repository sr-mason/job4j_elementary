package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int l =  (int) Math.ceil(Math.sqrt(array.length));
        int[][] a = new int[l][l];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (k < array.length && array.length  > (i + j + 1)) {
                    a[i][j] = array[k++];
                } else {
                    a[i][j] = 0;
                }

            }
        }
        return a;
    }
}