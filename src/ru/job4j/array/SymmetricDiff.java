package ru.job4j.array;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] a = new int[left.length + right.length];
        int count = 0;
        if (left.length > right.length && right.length == 0) {
            for (int k : left) {
                a[count++] = k;
            }
        }
        if (left.length < right.length && left.length == 0) {
            for (int k : right) {
                a[count++] = k;
            }
        }
        if (left.length != 0 && right.length != 0) {
            for (int j : left) {
                if (out(right, j)) {
                    a[count++] = j;
                }
            }
            for (int k : right) {
                if (out(left, k)) {
                    a[count++] = k;
                }
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