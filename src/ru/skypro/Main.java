package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Task 1

        System.out.println(" Task 1. Answers.");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Task 2
        System.out.print("\n");
        System.out.println("____________________");
        System.out.println(" Task 2. Answers.");

        int firstFriday = 5;

        for (int i = firstFriday; i <= 31; i = i + 7) {
            System.out.println(" Today is Friday " + i + "'th. Your need to send the report.");
        }

        // Task 3
        System.out.print("\n");
        System.out.println("____________________");
        System.out.println(" Task 3. Answers.");

        int yearNow = 2022;
        int yearBefore200 = yearNow - 200;
        int yearAfter100 = yearNow + 100;
        System.out.println(" Now is the " + yearNow + ". The nearest years of the comet's appearance: ");
        for (int i = 0; i < yearAfter100; i = i + 79)
            if ( yearBefore200 <= i ) {

                System.out.println(i);

            }
        }
    }
