package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball boll = new Ball();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        wolf.tryEat(boll);
        fox.tryEat(boll);
        hare.tryEat(boll);
        boll.tryEat(boll);
    }
}
