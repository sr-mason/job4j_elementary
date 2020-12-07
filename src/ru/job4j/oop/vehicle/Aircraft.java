package ru.job4j.oop.vehicle;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println("fly");
    }

    @Override
    public void speed() {
        int speed = 400;
        System.out.println(speed);
    }
}