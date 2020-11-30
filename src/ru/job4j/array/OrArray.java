package ru.job4j.array;

public class  OrArray {
    public static int[] or(int[] left, int[] right) {
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
        if (right.length != 0 && left.length != 0) {
            for (int k : left) {
                a[count++] = k;
            }
            for (int m : right) {
                if (out(a, m)) {
                    a[count++] = m;
                }
            }
        }
        if (count == 0) {
            return  new int[0];
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

