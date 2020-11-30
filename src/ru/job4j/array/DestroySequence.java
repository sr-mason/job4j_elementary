package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char[] a = new char[seq.length];
        for (int i = 0; i < a.length; i++) {
            if (i < 5) {
                a[i] = '0';
            } else if (i >= a.length - 5) {
                a[i] = '1';
            } else {
                a[i] = seq[i];
            }
        }
        return a;
    }
}