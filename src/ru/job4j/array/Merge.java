package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (leftCount < left.length && left[leftCount] < right[rightCount]) {
                rsl[i] = left[leftCount];
                leftCount++;
            } else {
                rsl[i] = right[rightCount];
                rightCount++;
            }
        }
        return rsl;
    }
}