package ru.job4j.oop;

public class Programmer extends Engineer {
    private String project;
    private String language;

    public Programmer(String name, String surname, String education, int birthday, String company, String project, String language) {
        super(name, surname, education, birthday, company);
        this.project = project;
        this.language = language;
    }
}
