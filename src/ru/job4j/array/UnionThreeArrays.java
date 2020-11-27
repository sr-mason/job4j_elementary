package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] a = new int[right.length + 1];
        for (int i = 0; i < a.length - 1; i++) {
            if (middle.length  > i && i % 2 != 0) {
                a[i + 1] = middle[i];
            }
            if (right.length  > i && i % 2 == 0) {
                a[i + 1] = right[i];
            }
        }
        a[0] = left[0];
        a[a.length - 1] = left[left.length - 1];
        return a;
    }
}
