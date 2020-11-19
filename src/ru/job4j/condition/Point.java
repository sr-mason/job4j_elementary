package ru.job4j.condition;
import java.lang.Math;
public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 2, 4, -3);
        System.out.println("result (3, 2) to (4, -3) " + result);
    }
}
