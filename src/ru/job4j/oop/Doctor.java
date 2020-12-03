package ru.job4j.oop;

public class Doctor extends Profession {
    private String hospital;

    public Doctor(String name, String surname, String education, int birthday, String hospital) {
        super(name, surname, education, birthday);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public String diagnosis(Engineer engineer) {
        return "Help";
    }

    public void heal() {
        System.out.println("Grate doctor");
    }
}
