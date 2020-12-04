package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 820);
        Book book2 = new Book("Core Java ", 920);
        Book book3 = new Book("Java - The Complete Reference", 1820);
        Book book4 = new Book("Head First Java", 730);
        Book[] book = new Book[4];
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;
        book[3] = book4;
        // print in console
        for (Book pr : book) {
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        // swap 0 and 3 element
        Book temp = book[0];
        book[0] = book[3];
        book[3] = temp;
        for (Book pr : book) {
            System.out.println(pr.getName() + " " + pr.getCount());
        }
        // loop search "Clean code"
        for (Book value : book) {
            if (value.getName().equals("Clean code")) {
                System.out.println(value.getName());
            }
        }
    }
}
