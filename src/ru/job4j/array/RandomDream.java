package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        String s = "";
        while (num > 0) {
            for (int i = 0; i < prizes.length; i++) {
                if (num - 1 ==  i) {
                    s = prizes[i];
                    return s;
                }
            }
            num -= prizes.length;
        }
        return s;
    }
}
