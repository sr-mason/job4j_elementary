package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int max = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}