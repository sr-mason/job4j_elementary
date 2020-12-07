package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private double price = 42.0;

    @Override
    public void ride() {

    }

    @Override
    public void passenger(int quantity) {
        this.passengers =  quantity;
    }

    @Override
    public double fillUp(double quantity) {
        return quantity * price;
    }
}
