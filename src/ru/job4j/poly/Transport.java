package ru.job4j.poly;

public interface Transport {
    void ride();

    void passenger(int quantity);

    double fillUp(double quantity);
}
