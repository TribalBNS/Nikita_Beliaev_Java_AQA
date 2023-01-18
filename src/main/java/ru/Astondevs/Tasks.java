package ru.Astondevs;

import java.util.Scanner;

public class Tasks {
    public static Scanner sc = new Scanner(System.in);
    public static void taskOne() {
        boolean keep = true;
        double number;
        while (keep) {
            System.out.print("Task 1. Enter a number: ");
            String input = Main.sc.nextLine();
            try {
                number = Double.parseDouble(input);
            }
            catch (NumberFormatException exception) {
                System.out.println("Not a number");
                continue;
            }
            keep = false;
            if (number > 7)
                System.out.println("Привет");
        }
    }

    public static void taskTwo() {
        System.out.print("Task 2. Enter a name: ");
        String name = Main.sc.nextLine();
        if (name.equals("Вячеслав"))
            System.out.println("Привет, " + name);
        else
            System.out.println("Нет такого имени");
    }

    public static void taskThree() {
        boolean keep = true;
        while (keep) {
            double[] arr;
            try {
                System.out.println("Enter an array of numbers, split with space");
                String array = Main.sc.nextLine();
                String[] string = array.split(" ");
                arr = new double[string.length];
                for (int i = 0; i < string.length; i++) {
                    arr[i] = Double.parseDouble(string[i]);
                }
            }
            catch (NumberFormatException exception) {
                System.out.println("Wrong input");
                continue;
            }
            keep = false;
            System.out.print("Multiples of 3: ");
            for (double j : arr) {
                if (j % 3 == 0)
                    System.out.print(j + " ");
            }
        }
        System.out.println("");
    }

    public static void taskFour() {
        System.out.println("Source array: [((())()(())]]");
        System.out.println("Correct array 1 - adding more brackets to equalize left and right ones: [[((())()(()))]]");
        System.out.println("Correct array 2 - removing extra brackets to equalize left and right ones: [(())()(())]");
        System.out.println("Correct array 3 - changing ] for ) to equalize brackets: [((())()(()))]");
    }
}
