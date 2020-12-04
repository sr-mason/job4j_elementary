package ru.job4j.pojo;

public class Book {
    private String name;
    private int countPage;

    public Book(String name, int count) {
        this.name = name;
        this.countPage = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return countPage;
    }

    public void setCount(int count) {
        this.countPage = count;
    }
}
