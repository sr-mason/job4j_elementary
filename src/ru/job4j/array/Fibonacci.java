package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        if (data[2] != data[0] + data[1]) {
            rsl = false;
        }
        for (int i = 0; i < data.length - 1 - i; i++) {
            if ((i < data.length - 2) && (data[data.length - 1 - i] != data[data.length - 2 - i] + data[data.length - 3 - i])) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
