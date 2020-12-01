package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == row && j == column) {
                    pushLeft(array, i, j);
                    pushRight(array, i, j);
                    pushUp(array, i, j);
                    pushDown(array, i, j);
                    array[i][j] = 0;
                    break;
                }
            }
        }
    }

    private static void pushLeft(int[][] array, int i, int column) {
        for (int j = 0; j < array[i].length; j++) {
            if (j < column) {
                array[i][j] = array[i][j + 1];
            }
        }
    }

    private static void pushRight(int[][] array, int i, int column) {
        for (int j = 0; j < array[i].length - j - 1; j++) {
            if (array[i].length - j - 1 > column) {
                array[i][array[i].length - j - 1] = array[i][array[i].length - j - 2];
            }
        }
    }

    private static void pushUp(int[][] array, int row, int j) {
        for (int i = 0; i < array.length; i++) {
            if (i < row) {
                array[i][j] = array[i + 1][j];
            }
        }
    }

    private static void pushDown(int[][] array, int row, int j) {
        for (int i = 0; i < array.length - 1 - i; i++) {
            if (array.length - 1 - i > row) {
                array[array.length - 1 - i][j] = array[array.length - 2 - i][j];
            }
        }
    }
}