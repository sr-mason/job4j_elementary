package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery bank = new Battery(2000);
        Battery telephone = new Battery(4000);
        System.out.println("power bank  = " + bank.load + ". telephone = " + telephone.load);
        bank.exchange(telephone);
        System.out.println("power bank  = " + bank.load + ". telephone = " + telephone.load);
    }
}
