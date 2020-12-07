package ru.job4j.oop.vehicle;

public class Transport {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle buss = new Buss();
        Vehicle train = new Train();
        Vehicle[] transports = new Vehicle[]{aircraft, buss, train};
        for (Vehicle a : transports) {
            a.move();
            a.speed();
        }
    }

}