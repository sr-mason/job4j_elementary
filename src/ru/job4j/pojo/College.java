package ru.job4j.pojo;
import java.util.Date;
public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFio("Colby Covington");
        student1.setGroup("fight");
        student1.setCreated(new Date());
        System.out.println(student1.getFio() + " come in group " + student1.getGroup()
                + " : " + student1.getCreated());

    }
}
