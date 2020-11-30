package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] a = new int[left.length + right.length];
        int count = 0;
        if (left.length >= right.length) {
            for (int k : right) {
                for (int i : left) {
                    if (k == i) {
                        a[count++] = k;
                    }
                }
            }
        } else {
            for (int k : left) {
                for (int i : right) {
                    if (k == i) {
                        a[count++] = k;
                    }
                }
            }
        }
        if (count == 0) {
            return  new int[0];
        }
        int[] b = new int[count];
        if (count >= 0) {
            System.arraycopy(a, 0, b, 0, count);
        }

        return b;
    }
}