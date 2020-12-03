package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private int birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public class Doctor extends Profession {
        private String hospital;

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

    public class  Engineer extends Profession {
        private String company;

        public String getCompany() {
            return company;
        }

        public int timeProject(String project) {
            return 100500;
        }
    }

    public class  Programmer extends Engineer {
        private String project;
        private String language;
    }

    public class  Builder extends Engineer {
        private String object;
    }

    public class  Surgeon extends Doctor {

    }

    public class  Dentist extends Doctor {

    }
}