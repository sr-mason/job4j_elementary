package ru.job4j.oop.vehicle;

public class Transport implements Vehicle {

    @Override
    public void move() {
    }

    @Override
    public void speed() {
    }

    public static void main(String[] args) {
        Transport aircraft = new Aircraft();
        Transport buss = new Buss();
        Transport train = new Train();
        Transport[] transports = new Transport[]{aircraft, buss, train};
        for (Transport a : transports) {
            a.move();
            a.speed();
        }
    }
}
