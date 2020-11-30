package ru.job4j.array;

public class NumberToArray {
    public static int[] resolve(int number) {
        int count = 0;
        int k = number;
        while (k > 0) {
            k = k / 10;
            count++;
        }
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = number % 10;
            number = number / 10;
        }
        return a;
    }
}
