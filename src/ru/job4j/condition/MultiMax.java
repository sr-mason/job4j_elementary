package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first > second) {
            if (first > third) {
                result = first;
            }
        } else if (second > first) {
            if (second > third) {
                result = second;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(93, 43, 42));
    }
}