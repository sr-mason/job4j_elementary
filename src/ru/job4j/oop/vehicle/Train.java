package ru.job4j.oop.vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("raid on rails");
    }

    @Override
    public void speed() {
        int speed = 100;
        System.out.println(speed);
    }
}
