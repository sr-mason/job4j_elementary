package ru.job4j.oop.vehicle;

public class Buss implements Vehicle {
    @Override
    public void move() {
        System.out.println("raid on street");
    }

    @Override
    public void speed() {
        int speed = 50;
        System.out.println(speed);
    }
}
