package ru.job4j.oop;

public class Engineer extends Profession {
    private String company;

    public Engineer(String name, String surname, String education, int birthday, String company) {
        super(name, surname, education, birthday);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public int timeProject(String project) {
        return 100500;
    }
}
