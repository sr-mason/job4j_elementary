package ru.job4j.array;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] a = new int[left.length + right.length];
        int count = 0;
        for (int j : left) {
            if (out(right, j)) {
                a[count++] = j;
            }
        }
        if (count == 0) {
            return new int[0];
        }
        int[] b = new int[count];
        System.arraycopy(a, 0, b, 0, count);
        return b;
    }

    public static boolean out(int[] a, int b) {
        for (int j : a) {
            if (b == j) {
                return false;
            }
        }
        return true;
    }
}