package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int startNumber = 11;
        int flagPlayer = 0;
        while (startNumber != 0) {
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1 || select == 2 || select == 3) {
                startNumber -= select;
                System.out.printf("%d спичек осталось на столе", startNumber);
                System.out.println();
                flagPlayer++;
            } else {
                System.out.println("Write number on 1 to 3");
            }
        }
        if (flagPlayer % 2 == 0) {
            System.out.println("Win 1st player");
        } else {
            System.out.println("Win 2d player");
        }
    }
}
