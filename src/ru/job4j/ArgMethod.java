package ru.job4j;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void hello(String name,int age) {
        System.out.println("Hello, " + name + "age " + age);
    }
    public static void hello(int age) {
        System.out.println("age " + age);
    }
    public static void hello(String ... name) {
        for (int i = 0; i < name.length ; i++) {
            System.out.println("Hello, " + name[i]);
        }
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }

}
