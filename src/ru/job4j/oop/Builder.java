package ru.job4j.oop;

public class Builder extends Engineer {
    private String object;

    public Builder(String name, String surname, String education, int birthday, String company, String object) {
        super(name, surname, education, birthday, company);
        this.object = object;
    }
}
